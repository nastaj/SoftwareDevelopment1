/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (num != -1) {
            System.out.print("Enter number (-1 to quit): ");
            num = input.nextInt();
            sum += num;
            if (num == -1) {
                sum++;
            }
        }

        System.out.println();
        System.out.println("Sum of numbers entered is: "+sum);
        input.close(); 
    }  
}