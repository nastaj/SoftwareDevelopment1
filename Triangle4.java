/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 03/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Triangle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int rows = 8; rows >= 1; rows--) {
            for (int i = 8; i >= rows; i--) {
                System.out.print(" ");
            }
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}