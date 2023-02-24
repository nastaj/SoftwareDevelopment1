/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Grades1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double grade, avg;
        double total = 0;

        while (counter <= 10) {
            System.out.print("Enter grade "+counter+": ");
            grade = input.nextDouble();
            total+=grade;
            counter++;
        }

        avg = total/10;
        System.out.println("Average grade is: "+avg);
    }  
}