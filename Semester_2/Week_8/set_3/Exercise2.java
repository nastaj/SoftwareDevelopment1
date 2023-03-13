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

        System.out.print("Enter any number apart from ten: ");
        num = input.nextInt();

        if (num != 10) {
            System.out.println("Number entered is not equal to 10.");
        }
        else {
            System.out.println("You are not allowed to enter the number 10.");
        }

    }
}