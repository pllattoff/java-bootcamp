package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Account {

    private String accountNumber;
    private BigDecimal balance;
    private Set<Client> accountHolders = new HashSet<>();

    public Account(String accountNumber, BigDecimal balance, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolders.add(accountHolder);
    }

    public BigDecimal deposit(BigDecimal sum) {
        balance = balance.add(sum);
        System.out.println("deposit: " + sum + "; new balance = " + balance + "; " + this);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal sum) {
        balance = balance.subtract(sum);
        System.out.println("withdraw: " + sum + "; new balance = " + balance + "; " + this);
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
                ", balance=" + getBalance() +
                ", accountHolders=" + accountHolders +
                '}';
    }
}
