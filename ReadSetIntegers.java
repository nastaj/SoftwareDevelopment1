/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class ReadSetIntegers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sentinel = 1;
        int sumEven = 0;
        int sumOdd = 0;

        while (sentinel == 1) {
            System.out.print("Enter the number: ");
            num = input.nextInt();
            if (num % 2 == 0) {
                sumEven+=num;
            }
            else {
                sumOdd+=num;
            }
            System.out.print("Do you want to continue (1 for yes, 2 for no)?: ");
            sentinel = input.nextInt();
        }
        System.out.println();
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);
    }  
}