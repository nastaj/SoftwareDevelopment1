/*
Program name: Week 10
Description: Exercises for Week 10
Date: 06/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class OneOrTwo{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number (1 or 2): ");
    num = input.nextInt();

    if (num==1 || num==2) {
        System.out.println("Number is valid.");
    }
    else {
        System.out.println("Number is invalid.");
    }

    }
}