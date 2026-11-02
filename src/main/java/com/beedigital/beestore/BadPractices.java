
package com.beedigital.beestore;

public class BadPractices {

    // Unused private field
    private int unusedValue = 100;

    // Method with an unused local variable
    public void unusedVariable() {
        int number = 50;
        System.out.println("Hello");
    }

    // Always returns the same value
    public boolean isAlwaysTrue() {
        return true;
    }

    // Unnecessary condition
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Duplicate code
    public void displayProduct1() {
        System.out.println("Laptop");
        System.out.println("Computer");
        System.out.println("1000");
    }

    public void displayProduct2() {
        System.out.println("Laptop");
        System.out.println("Computer");
        System.out.println("1000");
    }

    // Hardcoded value
    public double calculateDiscount(double price) {
        return price * 0.15;
    }

    // Nested conditions
    public void checkNumber(int number) {
        if (number > 0) {
            if (number > 10) {
                if (number > 50) {
                    System.out.println("Very large number");
                }
            }
        }
    }
}
