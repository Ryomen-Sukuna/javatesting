package com.operator;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        int value1;
        int value2;
        int result;

        try (Scanner key = new Scanner(System.in)) {
            // Input value
            System.out.print("Input your value for addition: ");
            value1 = key.nextInt();
            System.out.print("Input yout value for addition: ");
            value2 = key.nextInt();

            // Addition
            result = value1 + value2;
            System.out.println("Result = " + result);

            // Input value
            System.out.print("Input your value for subsctraction: ");
            value1 = key.nextInt();
            System.out.print("Input your value for subsctraction: ");
            value2 = key.nextInt();

            // Subsctraction
            result = value1 - value2;
            System.out.println("Result = " + result);

            // Input value
            System.out.print("Input your value for multiplication: ");
            value1 = key.nextInt();
            System.out.print("Input your value for multiplication: ");
            value2 = key.nextInt();

            // Multiplication
            result = value1 * value2;
            System.out.println("Result = " + result);

            // Input value
            System.out.print("Input your value for division: ");
            value1 = key.nextInt();
            System.out.print("Input your value for division: ");
            value2 = key.nextInt();

            // Division
            result = value1 / value2;
            System.out.println("Result = " + result);

            // Input value
            System.out.print("Input your value for substraction: ");
            value1 = key.nextInt();
            System.out.print("Input your value for substraction: ");
            value2 = key.nextInt();

            // Subsctraction
            result = value1 - value2;
            System.out.println("Result = " + result);

            // Input value
            System.out.print("Input your value: ");
            value1 = key.nextInt();
            System.out.print("Input your value: ");
            value2 = key.nextInt();

            // Modulus
            result = value1 % value2;
            System.out.println("Results = " + result);
        }
    }
}
