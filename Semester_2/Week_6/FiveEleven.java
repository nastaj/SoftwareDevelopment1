/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FiveEleven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "";
        String output5 = "";
        String output11 = "";

        for (int i = 1; i < 51; ++i) {
            if (i % 5 == 0) {
                if (output5.length() == 0) {
                   output5 += i;
                   output += i; 
                }
                else {
                   output5 += ", " + i;
                   output += ", " + i;
                }
            }

            if (i % 11 == 0) {
                if (output11.length() == 0) {
                   output11 += i;
                }
                else {
                   output11 += ", " + i;
                }
                output += ", " + i;
            }
        }

        System.out.println();
        System.out.println("Numbers divisible by 5: ");
        System.out.println(output5);
        System.out.println();
        System.out.println("Numbers divisible by 11: ");
        System.out.println(output11);
        System.out.println();
        System.out.println("Numbers divisible by 5 and 11: ");
        System.out.println(output);
    }  
}