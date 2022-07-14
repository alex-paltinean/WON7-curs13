package com.fasttrack.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExercise {
    public static void main(String[] args) throws FileNotFoundException {
        readFromFile();
        int[] values = new int[2];
        try {
            values[3] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try again!");
        }
        try {
            readFromFile1();
        } catch (FileNotFoundException e) {
            System.out.println("Could not read from file. Anyway...");
        }
        System.out.println("This code makes sens to run even if i cannot read from file");
        readFromFile1();
    }

    private static void readFromFile() {
        try (FileReader in = new FileReader("files/student.data")) {
            BufferedReader bufferedReader = new BufferedReader(in);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Execution is not over yet!");
    }

    private static void readFromFile1() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/student.data"));
        System.out.println("This code makes no sense if the line above fails");
    }
}
