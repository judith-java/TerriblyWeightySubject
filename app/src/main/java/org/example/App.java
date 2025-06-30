package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Welcome to the Ounce Conversion Program!");
        System.out.println();

        int ounces = -1;
        while (true) {
            System.out.print("How many ounces do you have? ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Blank values are not allowed. Please enter the number of ounces.");
                continue;
            }

            try {
                ounces = Integer.parseInt(input);
                if (ounces < 0) {
                    System.out.println("Your input should be a positive number. Please enter the number of ounces.");
                    continue;
                }
                break; // valid input
            } catch (NumberFormatException e) {
                System.out.println("That is not a number! Please enter the number of ounces.");
            }
        }

        System.out.println("Thank you! Converting ounces to pounds.");
        System.out.println();

        System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
        System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".");
        System.out.println();

        // Add-On demo: converting pounds + ounces back to total ounces
        int poundsPart = ounces / 16;
        int ouncesPart = ounces % 16;
        System.out.println("Add-On Demo: Convert pounds and ounces to total ounces.");
        System.out.println(poundsPart + " lbs and " + ouncesPart + " oz is equivalent to " + converter.toOunces(poundsPart, ouncesPart) + ".");
        System.out.println();

        System.out.println("Thank you for using the OCP!");

        scanner.close();
    }
}
