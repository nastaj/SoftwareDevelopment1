/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeRows, sizeColumns;

        System.out.print("Enter number of rows: ");
        sizeRows = input.nextInt();

        System.out.print("Enter number of columns: ");
        sizeColumns = input.nextInt();

        for (int rows = 1; rows <= sizeRows; rows++) { // rows
            for (int columns = 1; columns <= sizeColumns; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}