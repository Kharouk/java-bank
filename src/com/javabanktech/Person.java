package com.javabanktech;

class Person {
    private String name;
    private int age;
    private double balance;

    Person(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getBalance() {
        return balance;
    }

    public void create(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
