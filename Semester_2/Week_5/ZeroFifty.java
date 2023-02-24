/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class ZeroFifty{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        while (num > 0 && num < 50);
        input.close();
        System.out.println("Number entered which is not between 0 and 50. Program ends.");

    }  
}