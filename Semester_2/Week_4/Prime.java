/*
Program name: S2 Week 4 Lab
Description: Exercises for Semester 2 Week 4 Lab
Date: 13/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean isPrime = true;

        System.out.print("Enter your number: ");
        num = input.nextInt();

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = true;
            }
            else {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(num+" is a prime number.");
        }
        else {
            System.out.println(num+" is not a prime number.");
        }
        
    }
}