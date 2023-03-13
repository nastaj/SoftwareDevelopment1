/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter a number: ");
        num = input.nextInt();

        if (num >= 50) {
            System.out.print("Number entered is not less than 50.");
        }
        else {
            System.out.print("Number entered is less than 50.");
        }
    }
}