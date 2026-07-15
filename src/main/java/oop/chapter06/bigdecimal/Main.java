package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    static void main() {

        Client client1 = new Client("John", "Smith", "C1001");
        Client client2 = new Client("Anna", "Schmidt", "C1002");
        Client client3 = new Client("Laura", "Fischer", "C1003");


        BankService bankService = new BankService();

        String accountNumber1 = bankService.createAccount(client1);
        String accountNumber2 = bankService.createAccount(client2);

        Account account1 = bankService.getAccount(accountNumber1);
        Account account2 = bankService.getAccount(accountNumber2);


//        //Geld auf das Konto einzahlen
//        account1.deposit(new BigDecimal("500"));
//        account1.deposit(new BigDecimal("52.2"));
//
//        //Geld vom Konto abheben
//        account1.withdraw(new BigDecimal("22.3"));

        //Überweisung
        bankService.transfer(new BigDecimal("200.00"), account1.getAccountNumber(), account2.getAccountNumber());

        //Adding another account owner:
        bankService.addAccountHolder(accountNumber1, client3);
        bankService.addAccountHolder(accountNumber1, client2);

        //Account splitting
        List<String> newAccountNumbers = bankService.split(accountNumber1);

        //Zinsrechner
        bankService.applyInterest(new BigDecimal("4.00"));

        //Transaktionen
        bankService.createTransaction(accountNumber1, new BigDecimal("550.50"), "First transaction");

    }
}
