package devoirLibreYE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecisionTest {

    @Test
    public void testGetId() {
        Employe employee = new Employe();
        Transaction transaction = new Transaction(null, null, 0);
        Decision decision = new Decision("123", transaction, employee);

        assertEquals("123", decision.getId());
    }

    @Test
    public void testGetTransaction() {
        Employe employee = new Employe();
        Transaction transaction = new Transaction(null, null, 0);
        Decision decision = new Decision("123", transaction, employee);

        assertEquals(transaction, decision.getTransaction());
    }

    @Test
    public void testGetEmployee() {
        Employe employee = new Employe();
        Transaction transaction = new Transaction(null, null, 0);
        Decision decision = new Decision("123", transaction, employee);

        assertEquals(employee, decision.getEmployee());
    }

    @Test
    public void testToString() {
        Employe employee = new Employe();
        Transaction transaction = new Transaction(null, null, 0);
        Decision decision = new Decision("123", transaction, employee);

        String expectedString = "Decision ID: 123\n" +
                                "Transaction: " + transaction.getId() + "\n" +
                                "Employee: " + employee.getId();

        assertEquals(expectedString, decision.toString());
    }

}

