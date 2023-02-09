/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 07/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwentyNums{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        while (i <= 20) {
            if (i <= 19) {
                System.out.print(i + " + ");
            }
            if (i == 20 ) {
                System.out.print(i + "");
            }
            i++;
        }
        System.out.println("");
    }
}