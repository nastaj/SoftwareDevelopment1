/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Five{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Divisible by 5:");

        while (i <= 50) {
            if (i % 5 == 0 && i != 0) {
                if (i <= 45) {
                System.out.print(i+", ");
                }
                if (i == 50) {
                System.out.print(i);
                }
            }  
            i++;
        }
        System.out.println("");
    }  
}