/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String sentinel;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Number is even.");
            }
            else {
                System.out.println("Number is odd.");
            }

            System.out.print("Enter Y to continue: ");
            sentinel = input.next();
        }
        while (sentinel.equals("y"));
        input.close();
    }  
}