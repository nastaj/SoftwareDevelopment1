/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class IncrDecr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sentinel = 1;

        System.out.print("Please enter a value: ");
        num = input.nextInt();
        
        while (sentinel == 1 || sentinel == 2) {
            System.out.println("Menu:");
            System.out.println("1. For Increment ++.");
            System.out.println("2. For Decrement --.");
            System.out.println("-1. To quit.");
            System.out.print("Enter option (1, 2 or -1): ");
            sentinel = input.nextInt();
            if (sentinel == 1) {
                num++;
            }
            else if (sentinel == 2) {
                num--;
            }
            System.out.println("Value of number entered is now: "+num);
            System.out.println();
        }
    } 
}