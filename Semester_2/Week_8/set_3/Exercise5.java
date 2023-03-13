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

      for (int rows = 4; rows >= 1; rows--) {
            for (int columns = 4; columns >= rows; columns--) {
                System.out.print(columns+"\t");
            }
            System.out.println();
        }
    }
}