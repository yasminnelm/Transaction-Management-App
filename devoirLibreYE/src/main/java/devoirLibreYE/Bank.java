package devoirLibreYE;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	 private String name;
	 private String country;
	 private String bankCode;
	 private ArrayList<Account> accounts;
	 {
		 accounts=new ArrayList<>();
	 }
	 
	 // Constructor
	 public Bank(String name, String country, String bankCode) {
		this.name = name;
		this.country = country;
		this.bankCode = bankCode;
	 }
	 
	 // Getters and setters
	 public String getName() {
	        return name;
	 }
	 public void setName(String name) {
	     this.name=name;
	 }

	 public String getCountry() {
	     return country;
	 }
	 public void setCountry(String country) {
	     this.country=country;
	 }

	 public String getBankCode() {
	     return bankCode;
	 }
	 public void setBankCode(String bankCode) {
	     this.bankCode=bankCode;
	 }
	 
	 public List<Account> getAccounts(){
	     return accounts;
	 }
	 public void addAccount(Account account){
	     this.accounts.add(account);
	 }

	// Redefinition of the toString() method
	 @Override
	 public String toString() {
	     StringBuilder stringBuilder = new StringBuilder();
	     stringBuilder.append("Bank Name: ").append(name).append("\n");
	     stringBuilder.append("Country: ").append(country).append("\n");
	     stringBuilder.append("Bank Code: ").append(bankCode).append("\n");
	     stringBuilder.append("Accounts:\n");

	     for (Account account : accounts) {
	         stringBuilder.append(account.getAccountNbr()).append("\n");
      }

      return stringBuilder.toString();
	    }
	 
}
