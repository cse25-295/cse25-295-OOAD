package model;

public class InvestmentAccount extends Account {
    private final double interestRate = 0.05;
    private final double minimumDeposit = 500.00;

    public InvestmentAccount(String accountNumber, double initialBalance,
                             BankBranch branch) {
        super(accountNumber, checkInitialBalance(initialBalance), branch, "Investment");
    }

    private static double checkInitialBalance(double initialBalance) {
        if (initialBalance < 500.00) {
            throw new IllegalArgumentException(
                    "The minimum initial investment deposit is BWP 500.00.");
        }
        return initialBalance;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        deductAmount(amount);
    }

    public double getMinimumDeposit() {
        return minimumDeposit;
    }
}
