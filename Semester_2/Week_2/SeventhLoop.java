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
        int i = 2;

            while (i < 11 ) {
                System.out.println("Even Number (1-11): "+i);
                i = i+2;
            }
    }
}