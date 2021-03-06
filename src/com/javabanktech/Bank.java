package com.javabanktech;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    private double balance;
    private String accountName;
    private NumberFormat formatter = new DecimalFormat("#.00");
    private AccountStatement statement = new AccountStatement();

    public String greeting() {
        return "JavaBank is now Open!";
    }
    public String accountHolder() { return accountName; }
    public double currentBalance() { return balance; }
    public void getStatement() { statement.printStatement(); }
    public String balanceForDisplay() {
        return "Your current balance is $" + formatter.format(this.balance);
    }

    public String newAccount(Person person) {
        double d = person.getBalance();
        this.balance = d;
        this.accountName = person.getName();
        return String.format("Thanks for signing up with JavaBank, %s. Your current total is $"+
                formatter.format(d), accountName);
    }

    public void systemSignUpNewApplication() {
        Scanner input = new Scanner(System.in);
        Person individual = new Person(null, 0, 0);
        String name;
        int age;
        double balance;
        System.out.println("Let's get to know you! What's your name?");
        name = input.nextLine();
        this.accountName = name;
        System.out.println(String.format("Nice to meet you, %s. How old are you?", name));
        age = input.nextInt();
        System.out.println("Great; one last question. If we accept your application, what's your starting" +
                " balance?");
        balance = input.nextDouble();
        this.balance = balance;
        statement.addTransaction(0, 0, this.balance);
        individual.create(name, age, balance);
        System.out.println("Great! We have accepted your application.");
    }

    public void makeWithdrawal(double amount) {
        Scanner reader = new Scanner(System.in);
        System.out.println("You're making a withdrawal. Can you confirm to me your name please?");
        String input = "";
        if (balance >= amount) {
            while (!input.equals(this.accountName)) {
                input = reader.nextLine();
                if (input.equals(this.accountName)) {
                    balance -= amount;
                    statement.addTransaction(amount, 0, this.balance);
                    System.out.println(String.format("Thanks for confirming %s. We like to be cautious here at JavaBank. " +
                            "Your updated balance is $" + formatter.format(this.balance), this.accountName));
                    break;
                } else if (input.equals("quit")) {
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("That name isn't correct in our records. Please try again or type 'quit'.");
                }
            }
        } else {
            System.out.println("Sorry, you don't have that amount of money to withdraw.");
        }
    }

    public String depositMoney(double amount) {
        balance += amount;
        statement.addTransaction(0, amount, this.balance);
        return String.format("Thanks for trusting us with your cash %s, " +
                "your new balance is $" + formatter.format(balance), accountName);
    }
}


