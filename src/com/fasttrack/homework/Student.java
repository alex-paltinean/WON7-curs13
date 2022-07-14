package com.fasttrack.homework;

public class Student {
    private final int grade;
    private static int gradeSum = 0;
    private static int studentCount = 0;

    public Student(int grade) {
        this.grade = grade;
        gradeSum += grade;
        studentCount++;
    }

    public static double getAverage() {
        return (double) gradeSum / studentCount;
    }
}
