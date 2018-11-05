package javabank;

import java.util.Scanner;



public class JavaBank {
    public static void main(String[] args) {

    }

    public String greeting() {
        return "JavaBank is now Open!";
    }

    public String sayingHello() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine();
        return String.format("Nice to see you %s, welcome to JavaBank!", name);
    }

}
