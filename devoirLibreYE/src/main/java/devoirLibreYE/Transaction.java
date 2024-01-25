package devoirLibreYE;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


public class Transaction {
	private String id;
    private Date creationDate;
    private Date confirmationDate;
    private Account sender;
    private Account receiver;
    private double amount;
    private String type;
    private String status;
    private ArrayList<Employe> validators;
	{
		validators=new ArrayList<>();
	}
    
//    private boolean isAllowed;
//    private String transactionType;
    
    // Constructor
    public Transaction(Account sender,Account receiver,double amount) {
    	this.id = generateTransactionId();
    	this.creationDate=new Date();
    	this.sender=sender;
    	this.receiver=receiver;
    	this.amount=amount;
    	this.type=getType();
    	this.status=txnStatus();
    }
    
    // Getters
	public String getId() {
		return id;
	}
	public Date getConfirmationDate() {
		return confirmationDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Account getSender() {
		return sender;
	}
	public Account getReceiver() {
		return receiver;
	}
	public double getAmount() {
		return amount;
	}	
	
	public ArrayList<Employe> getValidators() {
		return validators;
	}

	// Generate the transaction ID
	String generateTransactionId() {
		return "TXN-" + UUID.randomUUID().toString();
	}

	// Getter that determines the type of the transaction
	String getType() {
		if (this.sender.getBank().getBankCode().equals(this.receiver.getBank().getBankCode())) {
			return "Domestic Transfer"; // Same bank code, same country
		} else if (this.sender.getBank().getCountry().equals(this.receiver.getBank().getCountry())) {
			return "National Transfer"; // Same country, different bank codes
		} else {
			return "International Transfer"; // Different countries
		}
	}

	// Calculate the number of required validations
	public int validatorsNumber() {
		if (amount > 1000000) {
			return 2;
		} else if (amount >= 100000) {
			return 1;
		} else {
			return 0;
		}
	}

	// Add a validator to the list of transaction validators
	public void addValidator(Employe e) {
		validators.add(e);
	}

	// Define the state of the transaction
	public String txnStatus() {
		int numberOfValidators = validators.size();
		int requiredValidators = validatorsNumber();

		if (numberOfValidators >= requiredValidators) {
			status = "Approved";
		} else {
			status = "Pending";
		}
		return status;
	}



}
