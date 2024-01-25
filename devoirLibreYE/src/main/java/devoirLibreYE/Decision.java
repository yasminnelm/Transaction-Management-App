package devoirLibreYE;

public class Decision {
    private String id;
    private Transaction transaction;
    private Employe employee;

    // Constructor
    public Decision(String id, Transaction transaction, Employe employee) {
        this.id = id;
        this.transaction = transaction;
        this.employee = employee;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Employe getEmployee() {
        return employee;
    }

    // Redefinition of the toString() method
    @Override
    public String toString() {
        return "Decision ID: " + id + "\n" +
                "Transaction: " + transaction.getId() + "\n" +
                "Employee: " + employee.getId();
    }
}

