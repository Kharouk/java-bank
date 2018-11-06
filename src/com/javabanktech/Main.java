package com.javabanktech;

class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 23, 100.00);
        Bank tsb = new Bank();
        tsb.greeting();
        tsb.sayingHello();
        tsb.newAccount(person);
    }
}