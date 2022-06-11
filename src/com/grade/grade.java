package com.grade;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        // Create variable and scanner
        int value;
        String grade;

        try (Scanner scan = new Scanner(System.in)) {
            // Take input
            System.out.print("Input your score here: ");
            value = scan.nextInt();
        }

        if (value >= 90) {
            grade = "A";
        } else if (value >= 80) {
            grade = "B+";
        } else if (value >= 70) {
            grade = "B";
        } else if (value >= 60) {
            grade = "C+";
        } else if (value >= 50) {
            grade = "C";
        } else if (value >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Print
        System.out.println("Grade : " + grade);
    }
}
