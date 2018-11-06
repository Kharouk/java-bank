package com.javabanktech;

public class AccountStatement {
    private String accountName;
    private double balance;

    public AccountStatement(Bank account) {
        this.accountName = account.accountHolder();
        this.balance = account.currentBalance();
    }

    public void printedStatement() {
        System.out.println(String.format("-----%s----------%f----", accountName, balance));
    }
}
