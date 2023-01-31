/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SoftDevOne{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        while (i <= 30) {
            while (i == 4) {
                System.out.println("Soft");
                i++;
            }
            while (i == 15 ) {
                System.out.println("Dev");
                i++;
            }
            while (i == 21) {
                System.out.println("One");
                i++;
            }
            while (i == 29) {
                System.out.println("SoftDevOne");
                i++;
            }
            System.out.println(i);
            i++;
        }
    }
}