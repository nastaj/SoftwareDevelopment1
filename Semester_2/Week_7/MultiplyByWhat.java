/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class MultiplyByWhat{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num;

      System.out.print("Enter a number: ");
      num = input.nextInt();

      if (num >= 20 && num <= 30) {
        num*=3;
      }
      else if (num >= 40 && num <= 50) {
        num*=5;
      }
      else if (num >= 60 && num <= 70) {
        num*=7;
      }
      else if (num >= 80 && num <= 90) {
        num*=9;
      }
      else {
        num*=10;
      }

      System.out.println("Number updated to: "+num);
    }
}