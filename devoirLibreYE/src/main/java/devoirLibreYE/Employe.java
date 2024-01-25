package devoirLibreYE;

import java.util.ArrayList;
import java.util.UUID;

public class Employe {
	public String id;
	public Bank bank;
	public ArrayList<Transaction> transactions;
	
	// Constructor
	public Employe() {
        this.id = generateEmployeId();
        transactions=new ArrayList<>();
    }
	
	//getters
    public String getId() {
        return id;
    }

    public Bank getBank() {
        return bank;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
	
	// Generate the employe's ID
	private String generateEmployeId() {
        return "EMP-" + UUID.randomUUID().toString();
    }

    // Approve a transaction
    public void approveTransaction(Transaction transaction) {
        String status = transaction.txnStatus();

        if (status.equals("Pending")) {
            transaction.addValidator(this);
            transactions.add(transaction);
            System.out.println("Transaction approved successfully.");
        } else {
            System.out.println("The transaction has already been approved. Cannot approve it again.");
        }
    }




}
