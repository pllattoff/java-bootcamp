package oop.chapter06.bigdecimal;

import java.math.BigDecimal;

public class Account {

    private String accountNumber;
    private BigDecimal balance;
    private Client client;

    public Account(String accountNumber, BigDecimal balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public BigDecimal deposit(BigDecimal sum) {
        balance = balance.add(sum);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal sum) {
        balance = balance.subtract(sum);
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", balance=" + getBalance() +
                ", client=" + client +
                '}';
    }
}
