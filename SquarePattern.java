/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Enter the size: ");
        size = input.nextInt();

        for (int rows = 1; rows <= size; rows++) { // rows
            for (int columns = 1; columns <= size; columns++) { // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}