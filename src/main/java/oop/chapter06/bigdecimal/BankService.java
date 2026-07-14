package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {

    private Map<String, Account> accounts = new HashMap<>();

    public String createAccount(Client client) {

        String newAccountNumber;
        do {
            newAccountNumber = UUID.randomUUID().toString().replace("-", "");
        } while (accounts.containsKey(newAccountNumber));

        Account account = new Account(newAccountNumber, new BigDecimal("0"), client);
        accounts.put(account.getAccountNumber(), account);

        return account.getAccountNumber();
    }

    public void transfer(BigDecimal sum, String fromAccountNumber, String toAccountNumber) {

        Account fromAccount = accounts.get(fromAccountNumber);
        BigDecimal fromAccountBalance = fromAccount.getBalance();
        fromAccountBalance = fromAccountBalance.subtract(sum);
        fromAccount.setBalance(fromAccountBalance);

        Account toAccount = accounts.get(toAccountNumber);
        BigDecimal toAccountBalance = toAccount.getBalance();
        toAccountBalance = toAccountBalance.add(sum);
        toAccount.setBalance(toAccountBalance);

    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
