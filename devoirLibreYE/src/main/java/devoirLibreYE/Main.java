package devoirLibreYE;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Create a bank
        Bank bank = new Bank("cih", "maroc", "1212");

        // Create customers
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");

        // Create accounts
        Account account1 = new Account(customer1, 1000, bank);
        Account account2 = new Account(customer2, 500, bank);

        // Perform transactions
        account1.credit(500);
        account2.debit(200);

        // Print account information
        System.out.println("Account 1:");
        System.out.println(account1);

        System.out.println("\nAccount 2:");
        System.out.println(account2);

        // Create employees
        Employe employe1 = new Employe();
        Employe employe2 = new Employe();

        // Create transactions
        Transaction transaction1 = new Transaction(account1, account2, 300);
        Transaction transaction2 = new Transaction(account2, account1, 100);

        // Approve transactions
        employe1.approveTransaction(transaction1);
        employe2.approveTransaction(transaction2);

        // Print decisions
        System.out.println("\nDecision 1:");
        Decision decision1 = new Decision("1", transaction1, employe1);
        System.out.println(decision1);

        System.out.println("\nDecision 2:");
        Decision decision2 = new Decision("2", transaction2, employe2);
        System.out.println(decision2);
    }
}

