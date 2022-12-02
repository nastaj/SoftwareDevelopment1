/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FourOrTwo{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num==2 || num==4) {
        System.out.println("Number entered "+num+" is either 4 or 2.");
    }

    else {
        System.out.println("Number entered "+num+" is neither 4 or 2.");
    }

    }
}