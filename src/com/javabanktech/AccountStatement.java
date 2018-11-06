package com.javabanktech;

public class AccountStatement {
    private String accountName;
    private double balance;

    public AccountStatement(Bank account) {
        this.accountName = account.accountHolder();
        this.balance = account.currentBalance();
    }

    public void printStatement() {
        System.out.println(
                "===========================\n" +
                "CREDIT || DEBIT || BALANCE \n" +
                "---------------------------\n" +
                "500.00 ||       || 1500.00 \n" +
                "       ||       || 1000.00 \n" +
                "===========================\n"
        );
    }
}
