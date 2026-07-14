package oop.chapter06.bigdecimal;

import java.math.BigDecimal;

public class Main {
    static void main() {

        Client client1 = new Client("John", "Smith", "C1001");
        Client client2 = new Client("Anna", "Schmidt", "C1002");
//        Client client3 = new Client("Laura", "Fischer", "C1003");


        BankService bankService = new BankService();

        String accountNumber1 = bankService.createAccount(client1);
        String accountNumber2 = bankService.createAccount(client2);

        Account account1 = bankService.getAccount(accountNumber1);
        System.out.println("account1: " + account1);

        Account account2 = bankService.getAccount(accountNumber2);
        System.out.println("account2: " + account2);


        //Geld auf das Konto einzahlen
        account1.deposit(new BigDecimal("500"));
        account1.deposit(new BigDecimal("52.2"));
        System.out.println(account1.getBalance());

        //Geld vom Konto abheben
        account1.withdraw(new BigDecimal("22.3"));
        System.out.println(account1.getBalance());

        //Überweisung
        System.out.println("Account1: balance = " + account1.getBalance() + "; Account2: balance = " + account2.getBalance());
        bankService.transfer(new BigDecimal("200.00"), account1.getAccountNumber(), account2.getAccountNumber());
        System.out.println("Account1: balance = " + account1.getBalance() + "; Account2: balance = " + account2.getBalance());





    }
}
