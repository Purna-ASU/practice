package com.apex.practise;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 8;  // Change this value to adjust the size of the pattern

        for (int i = -n + 1; i < n; i++) {
            int spaces = Math.abs(i);
            int decreasingNumbers = n - spaces;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = decreasingNumbers; k >= 1; k--) {
                System.out.print(k);
            }

            // Print increasing numbers (excluding 1)
            for (int k = 2; k <= decreasingNumbers; k++) {
                System.out.print(k);
            }

            System.out.println();  // Move to the next line
        }
    }
}

