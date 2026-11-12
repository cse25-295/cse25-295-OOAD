package model;

public class SavingsAccount extends Account {
    private final double interestRate = 0.0005;

    public SavingsAccount(String accountNumber, double initialBalance,
                          BankBranch branch) {
        super(accountNumber, initialBalance, branch, "Savings");
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException(
                "Withdrawals are not allowed from a savings account.");
    }
}
