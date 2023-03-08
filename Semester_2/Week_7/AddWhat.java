/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class AddWhat{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num;

      System.out.print("Enter a number: ");
      num = input.nextInt();

      if (num >= 10 && num <= 20) {
        num+=100;
      }
      else if (num >= 40 && num <= 50) {
        num+=400;
      }
      else {
        num+=10;
      }

      System.out.println("Number updated to: "+num);
    }
}