package devoirLibreYE;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customer {

	private String firstName;
	private String surname;
	private Date birthday;
	private String phoneNbr;
	private String address;
	private Account account;
	
	// Constructor
	public Customer(String firstName,String surname,Date birthday, String address, String phoneNbr) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phoneNbr = phoneNbr;
        this.birthday=birthday;
    }
	
	// Getters and setters
	public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    
    public String getPhoneNbr() {
        return phoneNbr;
    }
    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr=phoneNbr;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
    	try {
            this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Redefinition of the toString() method
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Full Name: ").append(firstName).append(" ").append(surname).append("\n");
        stringBuilder.append("Address: ").append(address).append("\n");
        stringBuilder.append("Phone Number: ").append(phoneNbr).append("\n");
        stringBuilder.append("Date of Birth: ").append(birthday).append("\n");
        if (account != null) {
            stringBuilder.append("Account Number: ").append(account.getAccountNbr()).append("\n");
        }
        return stringBuilder.toString();
    }



}
