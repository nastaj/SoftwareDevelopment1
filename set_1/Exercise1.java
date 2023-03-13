/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, numFirst, numLast, result;

        System.out.print("Enter number 1: ");
        numFirst = input.nextInt();

        for (int i = 2; i <= 7; i++) {
            System.out.print("Enter number "+i+": ");
            num = input.nextInt();
        }

        System.out.print("Enter number 8: ");
        numLast = input.nextInt();

        result = numFirst * numLast;

        System.out.println(numFirst+" * "+numLast+" = "+result);
    }
}