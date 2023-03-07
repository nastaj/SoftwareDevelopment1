/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Large{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int repeats, num = 0, largest = 0, largestInt = 0;

      System.out.print("Enter number of integers: ");
      repeats = input.nextInt();

      for (int i = 1; i <= repeats; i++) {
        System.out.print("Enter integer "+i+": ");
        num = input.nextInt();
        if (num > largest) {
            largestInt = i;
            largest = num;
            
        }
      }

      System.out.println("Largest Integer is Integer "+largestInt+": "+largest);
    }
}