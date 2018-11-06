package com.javabanktech;


import java.util.Scanner;

class Main {
    private static Bank javaBank;
    private static Person individual;

    public static void main(String[] args) {
        javaBank = new Bank();
        individual = new Person(null, 0, 0);
        Scanner input = new Scanner(System.in);
        String choice = "";
        applicationMenu();
    }

    public static void applicationMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "";
        System.out.println(javaBank.greeting());
        while (!choice.equals("quit")) {
            System.out.println(bankChoices());
            choice = input.nextLine();
            switch(choice) {
                case "1":
                    javaBank.systemSignUpNewApplication();
                    break;
                case "2":
                    System.out.println("How much would you like to withdraw?");
                    double value = input.nextDouble();
                    javaBank.makeWithdrawal(value);

                default:
                    break;

            }

        }

    }

    public static String bankChoices() {
        return "Type 1 if your opening up a new account with us!\n" +
                "Type 2 if you want to withdraw some moolah.\n" +
                "Type 3 if deposit your life's work.\n" +
                "Type 4 to check your balance.\n" +
                "Type 5 to print your statement.\n" +
                "Type 6 to change your name, you rockstar!\n" +
                "Type 'quit' to leave JavaBank Technical App.";
    }
}