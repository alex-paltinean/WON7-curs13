package com.fasttrack.classexercise;

import java.time.LocalDate;

public class BirthYearCalculator {
    public static int getBirthYear(int age) throws TooYoungException, TooOldException {
        if (age < 0) {
            throw new TooYoungException(age);
        }
        if (age > 150) {
            throw new TooOldException(age);
        }
        int currentYear = LocalDate.now().getYear();
        return currentYear - age;
    }
}

class TooOldException extends Exception {
    private final int age;

    public TooOldException(int age) {
        super("You're too old!");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class TooYoungException extends Exception {
    private final int age;

    public TooYoungException(int age) {
        super("You're not born yet!");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
