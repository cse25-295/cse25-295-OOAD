package model;

import java.util.ArrayList;

public abstract class Account implements InterestCalculator {
    private String accountNumber;
    private double balance;
    private BankBranch branch;
    private String accountType;
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, double initialBalance,
                   BankBranch branch, String accountType) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.branch = branch;
        this.accountType = accountType;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }

        balance += amount;
        transactions.add(new Transaction(
                createTransactionId(), "Deposit", amount));
    }

    public abstract void withdraw(double amount);

    protected void deductAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        balance -= amount;
        transactions.add(new Transaction(
                createTransactionId(), "Withdrawal", amount));
    }

    private String createTransactionId() {
        return "TR" + System.currentTimeMillis();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankBranch getBranch() {
        return branch;
    }

    public void setBranch(BankBranch branch) {
        this.branch = branch;
    }

    public String getAccountType() {
        return accountType;
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }
}
