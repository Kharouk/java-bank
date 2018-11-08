package com.javabanktech;

import java.util.*;
import java.text.SimpleDateFormat;


public class AccountStatement {
    private ArrayList<Transaction> listOfTransactions = new ArrayList<>();
    private String pattern = "MM-dd-yyyy";
    private SimpleDateFormat format = new SimpleDateFormat(pattern);

    public String printStatement() {
        System.out.println("date || credit || debit || balance");
        Collections.reverse(listOfTransactions);
        for(Transaction t:listOfTransactions) {
            String date = format.format(t.getDate());
            System.out.println(date + "||" + checkValues(t.getCredit()) + "||" + checkValues(t.getDebit()) + "||" + checkValues(t.getBalance()));
        }
        return "a value that must not be seen...";
    }

    public void addTransaction(double credit, double debit, double balance) {
        Transaction transaction = new Transaction(credit, debit, balance);
        listOfTransactions.add(transaction);
    }

    public String checkValues(String value) {
        if (value.equals("0.0")) {
            return " ";
        } else {
            return value;
        }
    }
}



