package com.javabanktech;


import java.util.Scanner;

class Main {
    private static Bank javaBank;
    private static Person individual;

    public static void main(String[] args) {
        javaBank = new Bank();
        individual = new Person(null, 0, 0);
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("quit")) {
            applicationMenu();
            choice = input.nextLine();
        }
    }

    public static void applicationMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "";
        System.out.println(javaBank.greeting());
        while (!choice.equals("quit")) {
            System.out.println(
                    "Type 1 if your opening up a new account with us!\n" +
                    "Type 2 if you want to withdraw some moolah.\n" +
                    "Type 3 if deposit your life's work.\n" +
                    "Type 4 to check your balance.\n" +
                    "Type 5 to print your statement.\n" +
                    "Type 6 to change your name, you rockstar!\n" +
                    "Type 'quit' to leave JavaBank Technical App."
            );
            choice = input.nextLine();
            switch(choice) {
                case "1":
                    javaBank.systemSignUpNewApplication();
                    String name;
                    int age;
                    double balance;
                    System.out.println("Let's get to know you! What's your name?");
                    name = input.nextLine();
                    System.out.println(String.format("Nice to meet you, %s. How old are you?", name));
                    age = input.nextInt();
                    System.out.println("Great; one last question. If we accept your application, what's your starting" +
                            " balance?");
                    balance = input.nextDouble();
                    individual.create(name, age, balance);
                    System.out.println("Great! We have accepted your application. Welcome to JavaBank.");
                    break;
                case "2":


                default:
                    break;

            }

        }

    }
}