/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 03/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Triangle5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 8;
        int columns = 0;

        for (int i = 1; i <= rows; i++, columns = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            while (columns != 2 * i - 1) {
                System.out.print("* ");
                columns++;
            }
            System.out.println();
        }
    }
}