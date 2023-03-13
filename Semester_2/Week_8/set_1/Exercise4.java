/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int row = 1; row <= 6; row++) {
            System.out.print("row "+row+": ");
            for (int column = 1; column <= 4; column++) {
                System.out.print("column "+column+" ");
            }
            System.out.println();
        }
    }
}