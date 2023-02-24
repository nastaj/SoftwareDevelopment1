/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class CountNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sentinel = 1;
        int numbersPositive = 0;
        int numbersNegative = 0;
        int numbersZeroes = 0;

        while (sentinel == 1) {
            System.out.print("Enter the number: ");
            num = input.nextInt();
            if (num > 0) {
                numbersPositive++;
            }
            else if (num < 0) {
                numbersNegative++;
            }
            else {
                numbersZeroes++;
            }
            System.out.print("Do you want to continue (1 for yes, 2 for no)?: ");
            sentinel = input.nextInt();
        }
        System.out.println();
        System.out.println("Positive numbers: "+numbersPositive);
        System.out.println("Negative numbers: "+numbersNegative);
        System.out.println("Zero numbers: "+numbersZeroes);
    }  
}