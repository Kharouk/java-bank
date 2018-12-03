package com.javabanktech;

import java.util.*;
import java.text.SimpleDateFormat;


class AccountStatement {
    private ArrayList<Transaction> listOfTransactions = new ArrayList<>();
    private String pattern = "MM-dd-yyyy";
    private SimpleDateFormat format = new SimpleDateFormat(pattern);

    void printStatement() {
        System.out.println("date || credit || debit || balance");
        Collections.reverse(listOfTransactions);
        for(Transaction t:listOfTransactions) {
            String date = format.format(t.getDate());
            System.out.println(date + "||" + checkValues(t.getCredit()) + "||" + checkValues(t.getDebit()) + "||" + checkValues(t.getBalance()));
        }
    }

    void addTransaction(double credit, double debit, double balance) {
        Transaction transaction = new Transaction(credit, debit, balance);
        listOfTransactions.add(transaction);
    }

    String checkValues(String value) {
        if (value.equals("0.0")) {
            return " ";
        } else {
            return value;
        }
    }
}



