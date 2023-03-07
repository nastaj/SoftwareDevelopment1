/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1, num2;

      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();

      System.out.println(num1+" + "+num2+" = "+(num1+num2));
      System.out.println(num1+" * "+num2+" = "+(num1*num2));
      System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
}