/*
Program name: S2 Week 4 Lab
Description: Exercises for Semester 2 Week 4 Lab
Date: 13/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Odd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 1; i <= 15; i++) {
            if (i%2 > 0) {
                sum += i;
            }
        }

        System.out.println("Result of adding all odd numbers from 1 to 15 is: "+sum);
    }  
}