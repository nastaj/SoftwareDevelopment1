/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 10/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Times{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int result = 0;
        int num;
        int option;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println();
        System.out.println("Select option 1 or 2:");
        System.out.println();
        System.out.println("1. Output addition table (1 to 12) for number entered.");
        System.out.println("2. Output multiplication table (1 to 12) for number entered.");
        System.out.println();
        System.out.print("Enter choice: ");
        option = input.nextInt();
        System.out.println();

        while (i <= 12) {
            if (option == 1) {
                result = num + i;
                System.out.println(num+" + "+i+" = "+result);
            }
            else if (option == 2) {
                result = num * i;
                System.out.println(num+" * "+i+" = "+result);
            }
            else {
                System.out.println("Invalid choice");
                break;
            }
            i++;
        }
    }
}