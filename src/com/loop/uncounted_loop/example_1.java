package com.loop.uncounted_loop;

import java.util.Scanner;

public class example_1 {
    public static void main(String[] args) {
        // Variable and scanner
        boolean running = true;
        int counter = 0;
        String answer;
        try (Scanner scan = new Scanner(System.in)) {
            while (running) {
                System.out.println("Are you sure to exit?");
                System.out.print("Answer[Yes/No]>");

                answer = scan.nextLine();

                // Check answer
                if (answer.equalsIgnoreCase("yes")) {
                    running = false;
                }
                counter++;
            }
        }

        System.out.println("You've done the loop for " + counter + " times");
    }
}
