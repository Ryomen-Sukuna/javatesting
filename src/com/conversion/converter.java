package com.conversion;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        // Declare
        Double area;
        int base, height;

        // Create new scanner
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("== Program to calculate area of Triangle ==");
        System.out.print("Input your area: ");
        base = scan.nextInt();
        System.out.print("Input your height: ");
        height = scan.nextInt();

        // Process
        area = Double.valueOf((base * height) / 2);

        // Output
        System.out.println("YOUR AREA:  " + area);
    }
}
