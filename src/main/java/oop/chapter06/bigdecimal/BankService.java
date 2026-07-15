package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public String createAccount(Client client) {

        String newAccountNumber;
        do {
            newAccountNumber = UUID.randomUUID().toString().replace("-", "");
        } while (accounts.containsKey(newAccountNumber));

        Account account = new Account(newAccountNumber, client);
        accounts.put(account.getAccountNumber(), account);

        System.out.println("createAccount: New account was created: " + account);

        return account.getAccountNumber();
    }

    public void transfer(BigDecimal sum, String fromAccountNumber, String toAccountNumber) {

        System.out.println("transfer: " + sum + "; fromAccountNumber = " + fromAccountNumber + "; toAccountNumber = " + toAccountNumber);

        String description = "Transfer of " + sum + " euros from account " + fromAccountNumber + " to account " + toAccountNumber;

        Account fromAccount = accounts.get(fromAccountNumber);
        fromAccount.withdraw(sum, description);

        Account toAccount = accounts.get(toAccountNumber);
        toAccount.deposit(sum, description);

        System.out.println("transfer: fromAccount balance = " + fromAccount.getBalance() + "; toAccount balance = " + toAccount.getBalance());
    }

    public List<String> split(String accountNumber) {

        if (accountNumber == null || accountNumber.isBlank()) {
            System.out.println("split: Account number is empty");
            return null;
        }

        Account mainAccount = accounts.get(accountNumber);
        if (mainAccount.getAccountHolders().size() < 2) {
            System.out.println("split: The mainAccount was not split because it has only one owner: " + mainAccount.getAccountHolders());
            return null;
        }

        List<String> newAccountNumbers = new ArrayList<>();

        // Creation of new accounts
        System.out.println("split: Creation of new accounts");

        for (Client client : mainAccount.getAccountHolders()) {
            newAccountNumbers.add(createAccount(client));
        }

        // Division of the amount among all participating accounts
        // using divideAndRemainder()
        System.out.println("split: Division of the amount among all participating accounts");

        BigDecimal mainBalance = mainAccount.getBalance();
        BigDecimal mainBalanceInCents = mainBalance.movePointRight(2);
        BigDecimal qtyAccountHolders = BigDecimal.valueOf(mainAccount.getAccountHolders().size());
        BigDecimal[] divisionResult = mainBalanceInCents.divideAndRemainder(qtyAccountHolders);

        BigDecimal amountPerPerson = divisionResult[0].movePointLeft(2);
        BigDecimal remainder = divisionResult[1];

        System.out.println("split: mainBalance = " + mainBalance + "; qtyAccountHolders = " + qtyAccountHolders);
        System.out.println("split: amountPerPerson = " + amountPerPerson + "; remainder = " + remainder);

        for (int i = 0; i < newAccountNumbers.size(); i++) {
            BigDecimal totalAmount = amountPerPerson;

            if (i < remainder.intValue()) {
                totalAmount = totalAmount.add(new BigDecimal("0.01"));
            }
            Account newAccount = getAccount(newAccountNumbers.get(i));
            newAccount.deposit(totalAmount, "Allocation of funds after account splitting");

            System.out.println("split: newAccount = " + newAccount);
        }

        mainAccount.withdraw(mainAccount.getBalance(), "Transfer of funds to new accounts");
        System.out.println("split: Resetting the balance on the base account: " + mainAccount);

        return newAccountNumbers;
    }

    public void applyInterest(BigDecimal rate) {

        System.out.println("applyInterest: Application of interest based on the interest rate: " + rate);

        for (Account account : accounts.values()) {
            BigDecimal balance = account.getBalance();
            BigDecimal interest = balance.multiply(rate.movePointLeft(2)).setScale(2, RoundingMode.HALF_UP);
            account.withdraw(interest, "Application of interest based on the interest rate: " + rate);

            System.out.println("applyInterest: balance = " + balance + "; interest = " + interest + "; " + account);
        }


    }

    public BigInteger createTransaction(String accountNumber, BigDecimal amount, String description) {

        if (accountNumber == null || accountNumber.isBlank() || !accounts.containsKey(accountNumber)) {
            System.out.println("createTransaction: Account number is empty or does not exist");
            return null;
        }

        Account account = accounts.get(accountNumber);
        return account.createTransaction(amount, description).id();
    }

    public void addAccountHolder(String accountNumber, Client accountHolder) {
        Account account = accounts.get(accountNumber);
        account.addAccountHolder(accountHolder);
        System.out.println("addAccountHolder: Another accountHolder has been added: accountNumber = " + accountNumber + "; " + accountHolder);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
