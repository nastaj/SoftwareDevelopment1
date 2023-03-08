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
      int donation;
      String name, gift = "";

      System.out.print("Enter your name: ");
      name = input.nextLine();
      System.out.print("Enter donation amount: ");
      donation = input.nextInt();
      
      if (donation < 20) {
        gift = "book";
      }
      else if (donation >= 20 && donation <= 40) {
        gift = "clothes voucher";
      }
      else if (donation > 40) {
        gift = "food hamper";
      }

      System.out.println("Thanks "+name+" for your donation. We will use it to purchase a "+gift+" for a person in need.");
    }
}