package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.util.*;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public String createAccount(Client client) {

        String newAccountNumber;
        do {
            newAccountNumber = UUID.randomUUID().toString().replace("-", "");
        } while (accounts.containsKey(newAccountNumber));

        Account account = new Account(newAccountNumber, new BigDecimal("0"), client);
        accounts.put(account.getAccountNumber(), account);

        System.out.println("createAccount: New account was created: " + account);

        return account.getAccountNumber();
    }

    public void transfer(BigDecimal sum, String fromAccountNumber, String toAccountNumber) {

        System.out.println("transfer: " + sum + "; fromAccountNumber = " + fromAccountNumber + "; toAccountNumber = " + toAccountNumber);

        Account fromAccount = accounts.get(fromAccountNumber);
        BigDecimal fromAccountBalance = fromAccount.getBalance();
        fromAccountBalance = fromAccountBalance.subtract(sum);
        fromAccount.setBalance(fromAccountBalance);

        Account toAccount = accounts.get(toAccountNumber);
        BigDecimal toAccountBalance = toAccount.getBalance();
        toAccountBalance = toAccountBalance.add(sum);
        toAccount.setBalance(toAccountBalance);

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
            newAccount.setBalance(totalAmount);

            System.out.println("split: newAccount = " + newAccount);
        }

        return newAccountNumbers;
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
