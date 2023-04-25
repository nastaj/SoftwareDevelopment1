/*
Program name: S2 Week 14 Assessment
Description: Assessment 5
Date: 25/04/2023
Author: Jakub Nasta
*/

// I have created two variants of the diff method as I was not completely sure which one would be the right one.

import java.util.Scanner;
public class Exercise4{
    static void college() {
        System.out.println("This is ATU");
    }

    // 1. Returns only the value of the difference operation.
    static int diff (int a, int b) {
        return a-b;
    }

    // 2. Returns and prints the whole string after being called in the main method.
    static void diff2(int a, int b) {
        System.out.println(a+" - "+b+" = "+(a-b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        college();

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        // 1.
        System.out.println(a+" - "+b+" = "+diff(a, b));

        // 2.
        diff2(a, b);
    }
}