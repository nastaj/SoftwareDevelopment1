/*
Program name: S2 Week 4 Lab
Description: Exercises for Semester 2 Week 4 Lab
Date: 13/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Sales{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.96;
        double item4 = 350.89;
        double total;
        double baseSalary = 200.0;
        double earnings;

        int itemQuant1, itemQuant2, itemQuant3, itemQuant4;

        System.out.print("Enter number sold of product item 1: ");
        itemQuant1 = input.nextInt();
        System.out.print("Enter number sold of product item 2: ");
        itemQuant2 = input.nextInt();
        System.out.print("Enter number sold of product item 3: ");
        itemQuant3 = input.nextInt();
        System.out.print("Enter number sold of product item 4: ");
        itemQuant4 = input.nextInt();

        earnings = ((itemQuant1 * item1) + (itemQuant2 * item2) + (itemQuant3 * item3) + (itemQuant4 * item4)) * 0.09;
        total = baseSalary + earnings;

        System.out.println();
        System.out.println("Earnings this week: "+Math.round(total));
        
    }
}