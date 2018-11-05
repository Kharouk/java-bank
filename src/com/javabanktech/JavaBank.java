package com.javabanktech;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class JavaBank {
    private double balance;
    private String accountName;

    public static void main(String[] args) {

    }

    public String greeting() {
        return "JavaBank is now Open!";
    }

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
        NumberFormat formatter = new DecimalFormat("#.00");
        this.balance = d;
        this.accountName = person.getName();
        return String.format("Thanks for signing up with JavaBank, %s. Your current total is $"+ formatter.format(d), accountName);
    }



}
