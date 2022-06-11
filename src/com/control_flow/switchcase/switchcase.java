// In this case im using traffic light for example

package com.control_flow.switchcase;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        // Make variable and scanner
        String traffic_light;
        try (Scanner scan = new Scanner(System.in)) {
            // Input
            System.out.print("Input your color: ");
            traffic_light = scan.nextLine();
        }

        switch (traffic_light) {
            case "red":
                System.out.println("Red light, stop!");
                break;
            case "yellow":
                System.out.println("Yellow light, be careful!");
                break;
            case "green":
                System.out.println("Green light, please go!");
                break;
            default:
                System.out.println("The color of the lamp you entered is wrong!");
        }
    }
}
