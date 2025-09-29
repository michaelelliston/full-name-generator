package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        System.out.println("Please enter your first name: ");
        firstName = myScanner.nextLine();

        System.out.println("Please enter the initial of your middle name, if applicable: ");
        middleName = myScanner.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = myScanner.nextLine();

        System.out.println("Please enter your suffix, if applicable: ");
        suffix = myScanner.nextLine();

        String output = firstName + middleName + lastName + suffix;
        System.out.println(output);

    }
}
