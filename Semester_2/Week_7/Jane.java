/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Jane{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name = "Jane";
      int age = 20;
      String course = "English";
      String uni = "NUIG";
      String career = "journalist";

      System.out.println(name+" is "+age+" years old and is studying "+course+" in "+uni+".");
      System.out.println("Some day she hopes to be a "+career+".");
    }
}