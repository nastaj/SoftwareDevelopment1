/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class LargeSmall{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int num;
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;

        while (i <= 5) {
            System.out.print("Enter number "+i+": ");
            num = input.nextInt();

            if (num > largestNum) {
                largestNum = num;
            }
            if (num < smallestNum) {
                smallestNum = num;
            }

            i++;
        }
        System.out.println();
        System.out.println("The largest number is: "+largestNum);
        System.out.println("The smallest number is: "+smallestNum);
    }
}