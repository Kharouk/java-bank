package com.javabanktech;

        import java.text.DecimalFormat;
        import java.text.NumberFormat;
        import java.util.Scanner;

public class Bank {
    private double balance;
    private String accountName;

    public static void main(String[] args) {

    }

    public void greeting() {
        System.out.println("JavaBank is now Open!");
    }

    public void sayingHello() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Are you changing your name?");
        String name = reader.nextLine();
        if (name.equals("no") || name.equals("n")) {
            System.out.println("Fair enough. Have a wonderful day!");
        } else {
            this.accountName = name;
            System.out.println(String.format("That's a great new name %s, enjoy your time at the JavaBank!", accountName));
        }
    }

    public void newAccount(Person person) {
        double d = person.getBalance();
        NumberFormat formatter = new DecimalFormat("#.00");
        this.balance = d;
        this.accountName = person.getName();
        System.out.println(String.format("Thanks for signing up with JavaBank, %s. Your current total is $"+ formatter.format(d), accountName));
    }

}

