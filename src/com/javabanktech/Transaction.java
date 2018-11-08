package com.javabanktech;

import java.util.Date;
import java.util.Calendar;

public class Transaction {
    private double credit;
    private double debit;
    private double balance;
    private Date date;


    public Transaction(double credit, double debit, double balance) {
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
        this.date = Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public String getCredit() {
        if (this.credit == 0.0) {
            return " ";
        } else {
            return String.format("%.2f", credit);
        }
    }

    public String getDebit() {
        if (this.debit == 0.0) {
            return " ";
        } else {
            return String.format("%.2f", debit);
        }
    }

    public String getBalance() {
        if (this.balance == 0.0) {
            return " ";
        } else {
            return String.format("%.2f", balance);
        }
    }

}
