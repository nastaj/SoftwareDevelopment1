/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Grades4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sentinel = 1;
        int counter = 0;
        double theinput, totalSubjectOne = 0, totalSubjectTwo = 0;
        
        while (sentinel == 1) {
            System.out.print("Enter grades (1 for yes, 0 for no): ");
            sentinel = input.nextInt();

            if (sentinel == 1) {
                counter++;
                System.out.print("Enter grade "+counter+" for subject 1: ");
                theinput = input.nextDouble();
                totalSubjectOne += theinput;
                System.out.print("Enter grade "+counter+" for subject 2: ");
                theinput = input.nextDouble();
                totalSubjectTwo += theinput;
            }
        }
        
        System.out.println("Average grade for subject 1 is: "+(totalSubjectOne/counter));
        System.out.println("Average grade for subject 2 is: "+(totalSubjectTwo/counter));
        System.out.println("Overall Average grade is: "+((totalSubjectOne+totalSubjectTwo)/(counter*2)));
        input.close();

    }  
}