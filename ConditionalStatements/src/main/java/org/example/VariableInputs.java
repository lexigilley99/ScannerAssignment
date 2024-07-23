package org.example;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();

        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();

        System.out.println("Enter a double:");
        double doubleNumber = scanner.nextDouble();

        System.out.println("Enter a boolean value:");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + doubleNumber);
        System.out.println("Your boolean is " + booleanValue);
    }
}
