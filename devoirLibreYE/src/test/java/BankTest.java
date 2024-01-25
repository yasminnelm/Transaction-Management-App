package devoirLibreYE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BankTest {

    @Test
    public void testGetName() {
        Bank bank = new Bank("cih", "maroc", "1212");
        assertEquals("cih", bank.getName());
    }

    @Test
    public void testGetCountry() {
        Bank bank = new Bank("cih", "maroc", "1212");
        assertEquals("maroc", bank.getCountry());
    }

    @Test
    public void testGetBankCode() {
        Bank bank = new Bank("cih", "maroc", "1212");
        assertEquals("1212", bank.getBankCode());
    }

    @Test
    public void testGetAccounts() throws ParseException {
        Bank bank = new Bank("cih", "maroc", "1212");
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Account account = new Account(customer, 1000, bank);
        bank.addAccount(account);
        assertEquals(1, bank.getAccounts().size());
    }

    @Test
    public void testToString() throws ParseException {
        Bank bank = new Bank("cih", "maroc", "1212");
        Customer customer = new Customer("Yassamine", "Elmchaouri", new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2001"), "Adresse", "0612345678");
        Account account = new Account(customer, 1000, bank);
        bank.addAccount(account);

        String expected = "Bank Name: cih\n" +
                "Country: maroc\n" +
                "Bank Code: 1212\n" +
                "Accounts:\n" +
                account.getAccountNbr() + "\n";

        assertEquals(expected, bank.toString());
    }
}
