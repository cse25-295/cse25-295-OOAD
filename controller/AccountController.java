package controller;

import model.Account;
import model.BankBranch;
import model.Customer;
import model.SavingsAccount;
import model.InvestmentAccount;
import model.ChequeAccount;

public class AccountController {

    public SavingsAccount openSavingsAccount(Customer customer,
                                             String accountNumber,
                                             double initialBalance,
                                             BankBranch branch) {
        checkCustomer(customer);

        SavingsAccount account = new SavingsAccount(
                accountNumber, initialBalance, branch);

        customer.addAccount(account);
        return account;
    }

    public InvestmentAccount openInvestmentAccount(Customer customer,
                                                   String accountNumber,
                                                   double initialBalance,
                                                   BankBranch branch) {
        checkCustomer(customer);

        InvestmentAccount account = new InvestmentAccount(
                accountNumber, initialBalance, branch);

        customer.addAccount(account);
        return account;
    }

    public ChequeAccount openChequeAccount(Customer customer,
                                           String accountNumber,
                                           double initialBalance,
                                           BankBranch branch,
                                           String employerName,
                                           String employerAddress) {
        checkCustomer(customer);

        ChequeAccount account = new ChequeAccount(
                accountNumber, initialBalance, branch,
                employerName, employerAddress);

        customer.addAccount(account);
        return account;
    }

    public void deposit(Account account, double amount) {
        checkAccount(account);
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        checkAccount(account);
        account.withdraw(amount);
    }

    public double checkBalance(Account account) {
        checkAccount(account);
        return account.getBalance();
    }

    public double calculateInterest(Account account) {
        checkAccount(account);
        return account.calculateInterest();
    }

    private void checkCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer was not found.");
        }
    }

    private void checkAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account was not found.");
        }
    }
}
