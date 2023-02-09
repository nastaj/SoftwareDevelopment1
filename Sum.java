/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 07/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int sumNumbers = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int difference;

        while (i <= 100) {
            if (i%2 == 0) {
                sumEven += i;
            }
            else if (i%2 != 0) {
                sumOdd += i;
            }
            sumNumbers += i;
            i++;
        }

        difference = sumEven - sumOdd;

        System.out.println("Sum of numbers 1 to 100 is: "+sumNumbers);
        System.out.println("Sum of even numbers 1 to 100 is: "+sumEven);
        System.out.println("Sum of even numbers 1 to 100 is: "+sumOdd);
        System.out.println("Difference between sum of even and odd numbers is: "+difference);
    
    }
}