package com.control_flow.nested;

public class nested {
    // Use traffic violation as example
    public static void main(String[] args) {
        // Optional, true or false
        boolean driver_license = true;
        boolean vehicle_license = false;

        // checking if he/she will be ticketed or not
        if (driver_license == true && vehicle_license == true) {
            System.out.println("Not ticketed!");
        } else {
            System.out.println("You are ticketed!");
        }
    }
}
