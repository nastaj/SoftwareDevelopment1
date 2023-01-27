/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Match{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b;
        boolean c;

        System.out.print("Enter first value: ");
        a = input.next();

        System.out.print("Enter second value: ");
        b = input.next();

        c = a.equals(b);

        if (c == true) {
            System.out.println("Values match.");
        }

        else {
            System.out.println("Match not found.");
        }
}
}