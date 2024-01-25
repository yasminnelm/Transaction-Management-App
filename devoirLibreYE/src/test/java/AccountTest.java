package devoirLibreYE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AccountTest {
	
	@Test
	public void testGetAccountNbr() throws ParseException {
		Customer customer=new Customer("Yassamine","Elmchaouri",new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"),"Adresse ","0612345678");
		Bank bank=new Bank("cih","maroc","1212");
		Account account=new Account(customer,0,bank);
		String result=account.getAccountNbr();
		assertNotNull(result);
	}
	
	@Test
    public void testIsActive() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 0, bank);
        assertTrue(account.isActive());
        account.setActive(false);
        assertFalse(account.isActive());
    }
	
	@Test
    public void testGetDateOpen() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 0, bank);
        Date openingDate =account.getDateOpen();
        assertNotNull(openingDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedOpeningDate = dateFormat.format(openingDate);
        assertEquals("01/01/2023", formattedOpeningDate);
	}
	
	@Test
	public void testGetDateClose() {
	    try {
	        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
	        Bank bank = new Bank("cih", "maroc", "1212");
	        Account account = new Account(customer, 0, bank);
	        Date closingDate =new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2023");
	        account.setDateClose(closingDate);
	        Date retrievedClosingDate =account.getDateClose();
	        assertNotNull(retrievedClosingDate);
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedClosingDate = dateFormat.format(retrievedClosingDate);
	        assertEquals("31/12/2023", formattedClosingDate);
	    } catch (ParseException e) {
	        fail("Exception occurred: " + e.getMessage());
	    }
	}
	
	@Test
    public void testGetBalance() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 1000, bank);
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
	
	@Test
    public void testGetCustomer() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 0, bank);
        Customer retrievedCustomer = account.getCustomer();
        assertNotNull(retrievedCustomer);
        assertEquals("Yassamine", retrievedCustomer.getFirstName());
        assertEquals("Elmchaouri", retrievedCustomer.getSurname());
    }

	@Test
    public void testGetBank() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 0, bank);
        Bank retrievedBank = account.getBank();
        assertNotNull(retrievedBank);
        assertEquals("cih", retrievedBank.getName());
        assertEquals("maroc", retrievedBank.getCountry());
    }
	@Test
    public void testDebitValidAmount() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri",new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 1000, bank);
        account.debit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    public void testDebitInvalidAmount() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 1000, bank);
        account.debit(1500);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testCreditValidAmount() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 1000, bank);
        account.credit(200);
        assertEquals(1200, account.getBalance());
    }

    @Test
    public void testCreditInvalidAmount() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank = new Bank("cih", "maroc", "1212");
        Account account = new Account(customer, 1000, bank);
        account.credit(-200);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testToString() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Address", "0612345678");
        Bank bank = new Bank("cih", "Morocco", "1212");
        Account account = new Account(customer, 1000, bank);
        String expected = "  Account Number: " + account.getAccountNbr() + "\n" +
                "  Active: true\n" +
                "  Opening Date: " + account.getDateOpen() + "\n" +
                "  Closing Date: null\n" +
                "  Customer: " + customer + "\n" +
                "  Bank: " + bank + "\n" +
                "  Balance: 1000.0";
        assertEquals(expected, account.toString());
    }





}