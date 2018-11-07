package com.javabanktech;

import java.util.*;

public class AccountStatement {
    private ArrayList<Transaction> listOfTransactions = new ArrayList<>();

    public void printStatement() {
        System.out.println("date || credit || debit || balance");
        for(Transaction t:listOfTransactions) {
            System.out.println(t.getDate() + "||" + t.getCredit() + "||" + t.getDebit() + "||" + t.getBalance());
        }
    }

    public void addTransaction(double credit, double debit, double balance) {
        Transaction transaction = new Transaction(credit, debit, balance);
        listOfTransactions.add(transaction);
    }
}



