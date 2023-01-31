/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SeventhLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int value = 1;
        int num, calc;
        
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        
            while (i < 5 ) {
                calc = num * value;
                System.out.println(num+" times "+value+" = "+calc);

                value++;
                i++;
            }
    }
}