package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Account {

    private String accountNumber;
//    private BigDecimal balance;
    private List<Transaction> transactions = new ArrayList<>();
    private Set<Client> accountHolders = new HashSet<>();

    public Account(String accountNumber, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolders.add(accountHolder);
    }

    public BigDecimal deposit(BigDecimal amount, String description) {
        System.out.println("deposit: amount = " + amount + "; " + this);

        Transaction transaction = createTransaction(amount, description);
        return transaction.balance();
    }

    public BigDecimal withdraw(BigDecimal amount, String description) {

        amount = amount.negate();
        System.out.println("withdraw: amount = " + amount + "; " + this);

        Transaction transaction = createTransaction(amount, description);
        return transaction.balance();
    }

    public Transaction createTransaction(BigDecimal amount, String description) {

        Date date = new Date();
        BigInteger transactionId;
        BigDecimal balance;

        if (transactions.isEmpty()) {
            transactionId = BigInteger.ONE;
            balance = BigDecimal.ZERO;
        } else {
            transactionId = transactions.getLast().id().add(BigInteger.ONE);
            balance = transactions.getLast().balance();
        }
        balance = balance.add(amount);

        Transaction transaction = new Transaction(transactionId, amount, balance, description, date);
        transactions.add(transaction);

        System.out.println("createTransaction: Transaction created: transaction = " + transaction);

        return transaction;
    }

    public BigDecimal getBalance() {
        if (transactions.isEmpty()) {
            return BigDecimal.ZERO;
        }
        return transactions.getLast().balance();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void addAccountHolder(Client accountHolder) {
        this.accountHolders.add(accountHolder);
    }

    public Set<Client> getAccountHolders() {
        return accountHolders;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", transactions=" + transactions +
                ", accountHolders=" + getAccountHolders() +
                '}';
    }
}
