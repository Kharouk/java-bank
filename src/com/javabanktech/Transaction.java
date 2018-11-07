package com.javabanktech;

import java.util.Date;

public class Transaction {
    private double credit;
    private double debit;
    private double balance;
    private String date;


    public Transaction(double credit, double debit, double balance) {
        var date = new Date();
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
        this.date = date.toString();
    }

    public String getDate() {
        return date;
    }

    public double getCredit() {
        return credit;
    }

    public double getDebit() {
        return debit;
    }

    public double getBalance() {
        return balance;
    }

}
