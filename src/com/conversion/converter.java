package com.conversion;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        // Declare
        Double luas;
        int alas, tinggi;

        // Create new scanner
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = scan.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = scan.nextInt();

        // Process
        luas = Double.valueOf((alas * tinggi) / 2);

        // Output
        System.out.println("Luas = " + luas);
    }
}
