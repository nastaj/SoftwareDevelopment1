/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NestedLoopOne{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      for (int rows = 1; rows <= 5; rows++) {
        for (int cols = 1; cols <= 3; cols++) {
            System.out.print("1 ");
        }
        System.out.println();
      }
    }
}