package com.fasttrack.classexercise;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1) create an object BirthYearCalculator that receives your age and returns your birth year
		- if the age is invalid - throw custom exceptions
2) create an application that uses the BirthYearCalculator that requests for user input for the age of the person. If exceptions are thrown, the application will prompt the user for correct information

eg.
Please input your age: -22
Age -22 is invalid.
Please input your age: 40
Your birth year is 1979
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readAgeAndPrintBirthYear(scanner);
    }

    private static void readAgeAndPrintBirthYear(Scanner scanner) {
        System.out.print("Please input your age: ");
        int age = scanner.nextInt();
        try {
            System.out.println(String.format("Your birth year is %d", BirthYearCalculator.getBirthYear(age)));
        } catch (TooYoungException | TooOldException e) {
            System.out.println(String.format("Age %d is invalid!", age));
            readAgeAndPrintBirthYear(scanner);
        }
    }
}
