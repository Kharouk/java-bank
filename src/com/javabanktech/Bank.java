package com.javabanktech;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    private double balance;
    private String accountName;
    private NumberFormat formatter = new DecimalFormat("#.00");

    public String greeting() {
        return "JavaBank is now Open!";
    }
    public String accountHolder() { return accountName; }
    public double currentBalance() { return balance; }
    
    public String sayingHello() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Are you changing your name?");
        String name = reader.nextLine();
        if (name.equals("no") || name.equals("n")) {
            return "Fair enough. Have a wonderful day!";
        } else {
            this.accountName = name;
            return String.format("That's a great new name %s, enjoy your time at the JavaBank!", accountName);
        }
    }

    public String newAccount(Person person) {
        double d = person.getBalance();
        this.balance = d;
        this.accountName = person.getName();
        return String.format("Thanks for signing up with JavaBank, %s. Your current total is $"+
                formatter.format(d), accountName);
    }

    public String makeWithdrawal(double amount) {
        Scanner reader = new Scanner(System.in);
        System.out.println("You're making a withdrawal. Can you confirm to me your name please?");
        String input = "";
        while (!input.equals(this.accountName)) {
            input = reader.nextLine();
            if (!input.equals(this.accountName)) {
                System.out.println("That name isn't correct in our records. Please try again or type 'quit'.");
            }
        }
        balance -= amount;
        return String.format("Thanks for confirming %s. We like to be cautious here at JavaBank. Your updated balance is $"
                 + formatter.format(this.balance), this.accountName);
    }

    public String depositMoney(double amount) {
        balance += amount;
        return String.format("Thanks for trusting us with your cash %s, " +
                "your new balance is $" + formatter.format(balance), accountName);
    }
}
