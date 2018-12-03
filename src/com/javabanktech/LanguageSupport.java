package com.javabanktech;

public class LanguageSupport {
    private String language = "English";

    public void main(String[] args) {
        beginLaunch();
    }

    void beginLaunch() {
        System.out.println(String.format("We are sorry that we have defaulted to %s. What language do you prefer?", this.language));
    }

    public String getLanguage() {
        return language;
    }
}