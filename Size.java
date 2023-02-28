/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Size{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Enter size: ");
        size = input.nextInt();

        if (size > 70 && size <= 100) {
            System.out.println("Go for Large size");
        }
        else if (size > 35 && size <= 70) {
            System.out.println("Go for Medium size");
        }
        else if (size >= 10 && size <= 35) {
            System.out.println("Go for Small size");
        }
        else {
            System.out.println("Size is not available");
        }
    }  
}