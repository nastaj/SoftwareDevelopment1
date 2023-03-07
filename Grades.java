/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Grades{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int grade = 0, total = 0, i = 1;
      double avg = 0;

      while (grade != -1) {
        System.out.print("Enter grade "+i+" (-1 to quit): ");
        grade = input.nextInt();
        total+=grade;
        if (grade == -1) {
            total++;
            i-=2;
        }
        i++;
      }
      avg = total/i;
      System.out.println("Average grade is: "+avg);
    }
}