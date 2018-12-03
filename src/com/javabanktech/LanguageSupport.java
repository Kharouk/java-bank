package com.javabanktech;

import java.util.Scanner;

public class LanguageSupport {
    private String language = "English";

    public void main(String[] args) {
        beginLaunch();
    }

    void beginLaunch() {
        System.out.println("We are sorry that we have defaulted to " + this.language + ". What language do you prefer?");
        userSetsLanguage();
    }

    String getLanguage() {
        return language;
    }

    private void userSetsLanguage() {
        Scanner input = new Scanner(System.in);
        this.language = input.nextLine();
        System.out.println(String.format("Okay, your preference of %s being the default language has been saved.", this.language));
        System.out.println("Please allow 10-15 Business Days for the changes to be made. Thank you for using JavaBank!");
    }

    String englishMenu() {
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

    // Un-needed yet fun console colors:
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}