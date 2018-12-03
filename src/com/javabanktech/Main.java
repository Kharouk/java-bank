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
        while (!choice.equals("Q")) {
            System.out.println(bankChoices());
            choice = input.nextLine();
            switch(choice) {
                case "1":
                    javaBank.systemSignUpNewApplication();
                    break;
                case "2":
                    javaBank.makeWithdrawal();
                    break;
                case "3":
                    javaBank.depositMoney();
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
                default:
                    System.out.println(languages.goodbye());
                    break;

            }

        }

    }

    public static String bankChoices() {
        return languages.englishMenu();
    }
}