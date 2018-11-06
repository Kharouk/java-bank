package com.javabanktech;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Bank javaBank = new Bank();
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("quit")) {
            System.out.println(javaBank.greeting());

            choice = input.nextLine();
        }
    }
}