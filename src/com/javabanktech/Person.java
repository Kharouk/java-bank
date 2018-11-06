package com.javabanktech;

public class Person {
    private String name;
    private int age;
    private double balance;

    public Person(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void create(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
