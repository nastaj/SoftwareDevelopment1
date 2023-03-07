/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NumberRange{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num;

      System.out.print("Enter a number: ");
      num = input.nextInt();

      if (num >= 10 && num <= 20) {
        System.out.println("Entered value is between 10 to 20.");
      }
      else {
        System.out.println("Entered value is not between 10 to 20.");
      }
    }
}