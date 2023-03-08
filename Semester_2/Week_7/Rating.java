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
      int value;
      String str = "";
      String rating = "";

      System.out.print("Enter rating for a book you just read (any value from 1 to 5): ");
      value = input.nextInt();

      str += "You gave the book you just read a rating of ";
      str += value+", which indicates you think the book is ";

      switch (value) {
        case 1:
        rating = "poor";
        str+=rating+".";
        break;
        case 2:
        rating = "not great";
        str+=rating+".";
        break;
        case 3:
        rating = "ok";
        str+=rating+".";
        break;
        case 4:
        rating = "very good";
        str+=rating+".";
        break;
        case 5:
        rating = "excellent";
        str+=rating+".";
        break;
        default:
        str = "Invalind value entered.";
      }
       
      System.out.println();
      System.out.println(str);
    }
}