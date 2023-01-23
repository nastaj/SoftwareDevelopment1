/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Shape{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int shape;

    System.out.println("");
    System.out.println("What shape would you like to print out?");
    System.out.println("1. Square");
    System.out.println("2. Triangle");
    System.out.print("Enter your choice (1 or 2): ");
    shape = input.nextInt();

    switch(shape) {
        case 1:
        System.out.println("");
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
        break;

        case 2:
        System.out.println("");
        System.out.println("      *      ");
        System.out.println("    * * *    ");
        System.out.println("  * * * * *  ");
        System.out.println("* * * * * * *");
        break;

        default:
        System.out.println("Invalid choice - can't print a shape.");
    }

    }
}