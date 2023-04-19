/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int result;
         String grade = "";

        System.out.print("Enter your result: ");
        result = input.nextInt();

        if (result >= 90) {
            grade = "H1";
        }
        else if (result >= 80 && result < 90) {
            grade = "H2";
        }
        else if (result >= 70 && result < 80) {
            grade = "H3";
        }
        else if (result >= 60 && result < 70) {
            grade = "H4";
        }
        else if (result >= 50 && result < 60) {
            grade = "H5";
        }
        else if (result >= 40 && result < 50) {
            grade = "H6";
        }
        else if (result >= 30 && result < 40) {
            grade = "H7";
        }
        else if (result < 30 && result >= 0) {
            grade = "H8";
        }
        else if (result < 0) {
            grade = "Invalid result";
        }

        System.out.println("Grade: "+grade);
    }
}

