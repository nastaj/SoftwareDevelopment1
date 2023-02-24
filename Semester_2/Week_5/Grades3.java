/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Grades3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double grade = 0;
        double avg = 0;
        double total = 0;

        while (grade != -1 && counter < 10) {
            counter++; 
            total+=grade;
            System.out.print("Enter grade "+counter+" (-1 to quit): ");
            grade = input.nextDouble();
            if (grade == -1) {
                counter--;
            }
        }
        avg = total/counter;

        System.out.println(counter);
        System.out.println("Average grade is: "+avg);
        input.close();
    }  
}