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
      String str = "";
      int age;
      double weight, price = 0;

      System.out.print("Please enter your age: ");
      age = input.nextInt();
      
      if (age < 6) {
        str = "Everything at the buffet is free for you!";
      }
      else if (age >= 6 && age <= 15) {
        System.out.print("Please enter your weight (lbs): ");
        weight = input.nextInt();

        price = 0.09*weight;
        str = "It will cost "+price+" to eat all you want from the buffet.";
      }
      else if (age >= 16 && age <= 59) {
        price = 10.95;
        str = "It will cost "+price+" to eat all you want from the buffet.";
      }
      else {
        price = 8.90;
        str = "It will cost "+price+" to eat all you want from the buffet.";
      }

      System.out.println(str);
    }
}