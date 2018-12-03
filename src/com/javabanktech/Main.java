package com.javabanktech;


import java.util.Scanner;

class Main {
    // setting up variables beforehand to keep things DRY
    private static Bank javaBank;
    private static LanguageSupport languages;

    public static void main(String[] args) {
        javaBank = new Bank();
        languages = new LanguageSupport();
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
                    languages.beginLaunch();
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
        return languages.englishMenu();
    }
}