package com.control_flow.prize;

import java.util.Scanner;

public class prize {
    public static void main(String[] args) {
        // make a variable for shopping and scanner
        int shopping = 0;

        try (Scanner scan = new Scanner(System.in)) {
            // Input
            System.out.print("Total spending: Rp ");
            shopping = scan.nextInt();
        }

        // check if shop more than 100000
        if (shopping > 100000) {
            System.out.println("Congratulations, you've got a reward!");
        } else {
            System.out.println("Go shopping again to have any reward from us!");
        }

        System.out.print("Thank You...");
    }
}
