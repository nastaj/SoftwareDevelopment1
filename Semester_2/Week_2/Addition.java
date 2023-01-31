/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int num;
        int total = 0;

        while (i <= 5) {
            System.out.print("Enter number "+i+": ");
            num = input.nextInt();

            total += num;
            i++;
        }
        System.out.println();
        System.out.println("When the five numbers are added together, the result is: "+total);
    }
}