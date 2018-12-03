package com.javabanktech;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    private double balance;
    private String accountName;
    private LanguageSupport languages = new LanguageSupport();
    private NumberFormat formatter = new DecimalFormat("#.00");
    private AccountStatement statement = new AccountStatement();
    private Scanner input = new Scanner(System.in);

    String greeting() {
        return "✅ JavaBank";
    }
    void getStatement() { statement.printStatement(); }
    String balanceForDisplay() {
        return "$" + formatter.format(this.balance);
    }

    void systemSignUpNewApplication() {
        int age;

        // User enters name here:
        System.out.println("Name?");
        this.accountName = input.nextLine();

        // User enters age here:
        System.out.println("Age?");
        age = input.nextInt();

        // User enters balance here:
        System.out.println("Starting balance?");
        this.balance = input.nextDouble();

        statement.addTransaction(0, 0, this.balance);
        new Person(this.accountName, age, this.balance);

        // Give Confirmation:
        System.out.println("Confirmed.");
    }

    void makeWithdrawal() {
        // User inputs how much to withdraw
        System.out.println("How much to withdraw?");
        double value = input.nextDouble();

        // Double check if they have the money
        if (balance >= value) {
            balance -= value;
            statement.addTransaction(value, 0, this.balance);
            System.out.println("Your new balance is $" + balance);
        } else {
            // An Example of refactoring English Interface:
            System.out.println(languages.withdrawalCatch());
        }
    }

    String depositMoney() {
        // User enter how much to deposit here:
        System.out.println("How much to Deposit?");
        double amount = input.nextDouble();
        balance += amount;
        statement.addTransaction(0, amount, this.balance);
        // User gets confirmation that balance has been updated:
        return "Balance is $" + formatter.format(balance);
    }
}


