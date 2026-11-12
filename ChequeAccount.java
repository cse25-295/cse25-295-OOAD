package model;

public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accountNumber, double initialBalance,
                         BankBranch branch, String employerName,
                         String employerAddress) {
        super(accountNumber, initialBalance, branch, "Cheque");
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

    @Override
    public void withdraw(double amount) {
        deductAmount(amount);
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }
}
