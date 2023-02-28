/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int rows = 1; rows <= 2; rows++) { // rows
            for (int columns = 1; columns <= 3; columns++) { // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}