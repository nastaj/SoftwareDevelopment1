/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 07/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class AddWhat3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num > 100) {
            num += 10;
            System.out.println("Number updated to: "+num);
        }
        else if (num > 50 && num <= 100) {
            num += 5;
            System.out.println("Number updated to: "+num);
        }
        else if (num > 20 && num <= 50) {
            num += 2;
            System.out.println("Number updated to: "+num);
        }
        else if (num <= 20) {
            num += 1;
            System.out.println("Number updated to: "+num);
        }
    }
}