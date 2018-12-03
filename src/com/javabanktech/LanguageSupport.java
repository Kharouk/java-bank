package com.javabanktech;

import java.util.Scanner;

public class LanguageSupport {
    private String language = "English";

    public void main(String[] args) {
        beginLaunch();
    }

    void beginLaunch() {
        System.out.println(String.format("We are sorry that we have defaulted to %s. What language do you prefer?", this.language));
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
}