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
        int num1, num2, num3, result;

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        num3 = input.nextInt();

        result = (num1 * 2) + (num2 * 4) + (num3 * 8);

        System.out.println("("+num1+" * 2) + ("+num2+" * 4) + ("+num3+" * 8) = "+result);
    }
}