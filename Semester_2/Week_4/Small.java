/*
Program name: S2 Week 4 Lab
Description: Exercises for Semester 2 Week 4 Lab
Date: 13/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Small{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, num;

        System.out.print("Enter number of integers: ");
        i = input.nextInt();

        for (int j = 1; j <= i; j++) {
            System.out.print("Enter integer "+j+": ");
            num = input.nextInt();   
        }
    }
}