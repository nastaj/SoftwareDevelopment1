/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        for (int rows = 1; rows <= 5; rows++) {
            System.out.print("Line "+rows+": ");
            for (int columns = 1; columns <= 4; columns++) {
                if (columns != 4) {
                System.out.print(i+", ");
                }
                else if(columns == 4) {
                    System.out.print(i+"");
                }
                i++;
            }
            System.out.println();
        }
    }
}