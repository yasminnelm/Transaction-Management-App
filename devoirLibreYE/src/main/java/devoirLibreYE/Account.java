package devoirLibreYE;

import java.util.Date;
import java.util.UUID;

public class Account {
	private final String accountNbr;
	private boolean active;
	private Date dateOpen;
	private Date dateClose;
	private Customer customer;
	private Bank bank;
	private double balance;
	
	// Constructor
	public Account(Customer customer,double initialBalance,Bank bank) {
        this.accountNbr = generateAccountNbr();
        this.dateOpen=new Date();
        this.active=true;
        this.balance=initialBalance;
        this.customer=customer;
        this.bank=bank;
    }
	
	// Getters and Setters
	public String getAccountNbr() {
		return accountNbr;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active=active;
	}
	
	public Date getDateOpen() {
		return dateOpen;
	}
	public void setDateOpen(Date dateOpen) {
		this.dateOpen=dateOpen;
	}
	
	public Date getDateClose() {
		return this.dateClose;
	}
	public void setDateClose(Date dateClose) {
		this.dateClose=dateClose;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public Bank getBank() {
		return bank;
	}

	
	// Method that generates the account number
	private String generateAccountNbr() {
        return "AC" + UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    }
	
	// Debit an amount from the account
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
			System.out.println("Debit of " + amount + " processed. New balance: " + balance);
		} else {
			System.out.println("Invalid debit amount or insufficient funds.");
		}
    }

	// Credit an amount to the account
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
			System.out.println("Credit of " + amount + " processed. New balance: " + balance);
        } else {
			System.out.println("Invalid credit amount.");
        }
    }


	// Redefinition of the toString() method
	@Override
	public String toString() {
		return "  Account Number: " + accountNbr + "\n" +
				"  Active: " + active + "\n" +
				"  Opening Date: " + dateOpen + "\n" +
				"  Closing Date: " + dateClose + "\n" +
				"  Customer: " + customer + "\n" +
				"  Bank: " + bank + "\n" +
				"  Balance: " + balance;
	}

}
