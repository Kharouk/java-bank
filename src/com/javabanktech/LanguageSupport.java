package com.javabanktech;

public class LanguageSupport {
    private String language = "English";
    public void main(String[] args) {
        beginLaunch();
    }

    private String beginLaunch() {
       return String.format("We are sorry that we have defaulted to %s. What language do you prefer?", this.language);
    }
}
