package com.fasttrack.homework;

public class StudentMain {
    public static void main(String[] args) {
        new Student(10);
        new Student(8);
        new Student(9);
        System.out.println(Student.getAverage());
    }
}
