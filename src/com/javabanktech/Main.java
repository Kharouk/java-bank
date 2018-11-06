package com.javabanktech;

class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 23, 200);
        Bank tsb = new Bank();
        tsb.newAccount(alex);
        AccountStatement statement = new AccountStatement(tsb);
        statement.printedStatement();
    }
}