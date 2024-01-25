package devoirLibreYE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmployeTest {
	@Test
    public void testGetId() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotNull(transaction.getId());
    }
	
	@Test
    public void testGetBank() {
        Employe employe = new Employe();
        assertNull(employe.getBank()); // The bank is not set in the constructor
    }
	 @Test
	    public void testGetTransactions() {
	        Employe employe = new Employe();
	        assertNotNull(employe.getTransactions());
	        assertTrue(employe.getTransactions().isEmpty());
	    }
	
	 @Test
	    public void testApproveTransaction() throws ParseException {
	        Employe employe = new Employe();
	        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
	        Bank bank1 = new Bank("cih", "maroc", "1212");
	        Account sender = new Account(customer1, 1000, bank1);

	        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
	        Bank bank2 = new Bank("xyz", "usa", "3434");
	        Account receiver = new Account(customer2, 500, bank2);

	        Transaction transaction = new Transaction(sender, receiver, 200);
	        employe.approveTransaction(transaction);

	        assertEquals(1, employe.getTransactions().size());
	        assertEquals(transaction, employe.getTransactions().get(0));
	    }
}

