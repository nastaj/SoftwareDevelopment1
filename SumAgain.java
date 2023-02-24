/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SumAgain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, sentinel;
        int sum = 0;

        do {
            System.out.print("Enter first number: ");
            firstNumber = input.nextInt();
            System.out.print("Enter second number: ");
            secondNumber = input.nextInt();

            sum = firstNumber + secondNumber;
            System.out.println("Sum of numbers: "+sum);

            System.out.print("Do you want to continue (1 for yes, 2 for no)?: ");
            sentinel = input.nextInt();
        }
        while (sentinel == 1);
        input.close();
    }  
}