/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NinthLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int total = 0;
        int grade = 0;
        double avg;

        while(i <= 5) {
            System.out.print("Enter grade for Student "+i+": ");
            grade = input.nextInt();
            total = total + grade;
            i++;
        }

        System.out.println();
        System.out.println("Total of all 5 grades is: "+total);
        avg = (double)total / 5;
        // avg = Math.round(avg * 100)/100;
        System.out.println("Class average is: "+avg);

    }
}