package controller;

import java.util.ArrayList;
import model.Account;
import model.Transaction;

public class TransactionController {

    public ArrayList<Transaction> viewTransactions(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account was not found.");
        }

        return account.getTransactions();
    }

    public Transaction findTransaction(Account account, String transactionId) {
        if (account == null) {
            throw new IllegalArgumentException("Account was not found.");
        }

        for (Transaction transaction : account.getTransactions()) {
            if (transaction.getTransactionId().equals(transactionId)) {
                return transaction;
            }
        }

        return null;
    }
}
