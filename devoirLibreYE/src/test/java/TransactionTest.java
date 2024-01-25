package devoirLibreYE;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {

    @Test
    public void testGetId() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotNull(transaction.getId());
    }

    @Test
    public void testGetConfirmationDate() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNull(transaction.getConfirmationDate());
    }

    @Test
    public void testGetCreationDate() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotNull(transaction.getCreationDate());
    }
    
    @Test
    public void testGetSender() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals(sender, transaction.getSender());
    }

    @Test
    public void testGetReceiver() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals(receiver, transaction.getReceiver());
    }

    @Test
    public void testGetAmount() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals(200, transaction.getAmount());
    }
    
    @Test
    public void testGenerateTransactionId() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotNull(transaction.generateTransactionId());
    }

    @Test
    public void testGetType() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotNull(transaction.getType());
    }
    
    @Test
    public void testValidVirInt() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("cih", "maroc", "1212"); // Same bank for VirInt
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("VirInt", transaction.getType());
    }

    @Test
    public void testInvalidVirInt() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("abc", "france", "5656"); // Different bank for Invalid VirInt
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertNotEquals("VirInt", transaction.getType());
    }
    
    @Test
    public void testValidVirEst() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("abc", "france", "5656");
        Account sender = new Account(customer1, 1000001, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("VirEst", transaction.getType());
    }
    
    @Test
    public void testInvalidVirEst() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("abc", "france", "5656");
        Account sender = new Account(customer1, 1000000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("VirCha", transaction.getType());
    }

    @Test
    public void testValidVirCha() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("abc", "france", "5656");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "france", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("VirCha", transaction.getType());
    }

    @Test
    public void testInvalidVirCha() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("abc", "france", "5656");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho", new SimpleDateFormat("dd/MM/yyyy").parse("20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("VirCha", transaction.getType());
    }

    @Test
    public void testValidatorsNbr() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals(0, transaction.validatorsNumber());
    }

    @Test
    public void testAddValidator() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        Employe employe = new Employe();
        transaction.addValidator(employe);
        assertEquals(1, transaction.getValidators().size());
    }

    @Test
    public void testTxnStatus() throws ParseException {
        Customer customer1 = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Bank bank1 = new Bank("cih", "maroc", "1212");
        Account sender = new Account(customer1, 1000, bank1);

        Customer customer2 = new Customer("Hihi", "Hoho",new SimpleDateFormat("dd/MM/yyyy").parse( "20/04/1996"), "Address", "0787654321");
        Bank bank2 = new Bank("xyz", "usa", "3434");
        Account receiver = new Account(customer2, 500, bank2);

        Transaction transaction = new Transaction(sender, receiver, 200);
        assertEquals("Pending", transaction.txnStatus());
    }
    
    
}

