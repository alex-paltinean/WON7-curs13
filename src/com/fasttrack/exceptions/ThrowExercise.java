package com.fasttrack.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowExercise {
    public static void main(String[] args) {
        try {
            unexpected();
            getFileSize("/files/data.txt");
            getFileSize1(null);
        } catch (MyUncheckedException e) {
            System.out.println(String.format("Something happened at %d", e.getTimeOfFailure()));
        } catch (MyException e) {
            System.out.println("This is checked!");
        } finally {
            System.out.println("This is executed after exception handling");
        }
    }

    public static int getFileSize(String path) throws MyException {
        boolean success = false; // read operation status
        if (!success) {
            throw new MyException("N-am gasit nimic!");
        }
        return 100;
    }

    public static int getFileSize1(File file) {
        if (file == null) {
            throw new MyUncheckedException("Tot nu vrea!");
        }
        return 10;
    }

    public static void unexpected() {
        throw new RuntimeException();
    }
}
