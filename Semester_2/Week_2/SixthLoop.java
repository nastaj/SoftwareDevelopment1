/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class ThirdLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;

        System.out.print("Enter a loop counter value: ");
        i = input.nextInt();
        System.out.println();

        System.out.println("Before While Loop");
            while (i < 5 ) {
                System.out.println("Inside Loop-Counter = "+i);
                i++;
            }
        System.out.println("After While Loop");
}
}