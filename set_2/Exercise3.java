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
            grade = "A";
        }
        else if (result >= 70 && result < 90) {
            grade = "B";
        }
        else if (result >= 50 && result < 70) {
            grade = "C";
        }
        else if (result < 50 && result >= 0) {
            grade = "F";
        }
        else if (result < 0) {
            grade = "Invalid result";
        }

        System.out.println("Grade: "+grade);
    }
}

