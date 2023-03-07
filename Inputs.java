/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Inputs{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name;
      int whole;
      double decimal;

      System.out.print("Enter your first name: ");
      name = input.next();
      System.out.print("Enter a whole number: ");
      whole = input.nextInt();
      System.out.print("Enter a decimal number: ");
      decimal = input.nextDouble();

      System.out.println();
      System.out.println(name+", you entered the numbers "+whole+" and "+decimal+".");
    }
}