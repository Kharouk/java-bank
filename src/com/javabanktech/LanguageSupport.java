package com.javabanktech;

import java.util.Scanner;

public class LanguageSupport {
    private String language = "English";

    public void main(String[] args) {
        beginLaunch();
    }

    void beginLaunch() {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("We are sorry that we have defaulted to %s. What language do you prefer?", this.language));
        String preferredLanguage = input.nextLine();
        this.language = preferredLanguage;
        System.out.println(String.format("Okay, your preference of %s as being the default language has been saved.\n", this.language));
        System.out.println("Please allow 10-15 Business Days for the changes to be made. Thank you for using JavaBank!");
    }

    public String getLanguage() {
        return language;
    }
}