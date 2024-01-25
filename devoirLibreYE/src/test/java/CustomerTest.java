package devoirLibreYE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomerTest {

    @Test
    public void testGetFirstName() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        String result = customer.getFirstName();
        assertEquals("Yassamine", result);
    }

    @Test
    public void testGetSurname() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        String result = customer.getSurname();
        assertEquals("Elmchaouri", result);
    }

    @Test
    public void testGetPhoneNbr() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        String result = customer.getPhoneNbr();
        assertEquals("0612345678", result);
    }

    @Test
    public void testGetAddress() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        String result = customer.getAddress();
        assertEquals("Adresse", result);
    }

    @Test
    public void testGetBirthday() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String expectedDate = "11/05/2001";
        String result = dateFormat.format(customer.getBirthday());
        assertEquals(expectedDate, result);
    }

    @Test
    public void testToString() throws ParseException {
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Address", "0612345678");
        String expectedToString = "Full Name: Yassamine Elmchaouri\n" +
                "Address: Address\n" +
                "Phone Number: 0612345678\n" +
                "Date of Birth: Sat May 11 00:00:00 UTC 2001\n" +
                "Account Number: null\n";
        String result = customer.toString();
        assertEquals(expectedToString, result);
    }


}

