package com.javabanktech;


import java.util.Scanner;

class Main {
    // Un-needed yet fun console colors:
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // setting up variables beforehand to keep things DRY
    private static Bank javaBank;
    private static LanguageSupport languageSupport;

    public static void main(String[] args) {
        javaBank = new Bank();
        languageSupport = new LanguageSupport();
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
                    break;
                case "3":
                    System.out.println("How much would you like to deposit?");
                    double amount = input.nextDouble();
                    javaBank.depositMoney(amount);
                    break;
                case "4":
                    System.out.println(javaBank.balanceForDisplay());
                    break;
                case "5":
                    javaBank.getStatement();
                    break;
                case "6":
                    languageSupport.beginLaunch();
                    break;
                case "quit":
                    System.out.println("Thanks for visiting JavaBank!");
                    break;
                default:
                    break;

            }

        }

    }

    public static String bankChoices() {
        return "=========================\n" +
                "Type" + ANSI_RED + " 1 " + ANSI_RESET + "if your opening up a new account with us!\n" +
                "Type" + ANSI_RED + " 2 " + ANSI_RESET + "if you want to withdraw some moolah.\n" +
                "Type" + ANSI_RED + " 3 " + ANSI_RESET + "if deposit your life's work.\n" +
                "Type" + ANSI_RED + " 4 " + ANSI_RESET + "to check your balance.\n" +
                "Type" + ANSI_RED + " 5 " + ANSI_RESET + "to print your statement.\n" +
                "Type" + ANSI_RED + " 6 " + ANSI_RESET + "to change languages.\n" +
                "=========================\n" +
                "Type " + ANSI_WHITE_BACKGROUND + ANSI_CYAN + "'quit'" + ANSI_RESET +
                " to leave JavaBank Technical App.";
    }
}