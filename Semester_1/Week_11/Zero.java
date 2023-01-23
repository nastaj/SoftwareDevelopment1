/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Zero{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num == 0) {
        System.out.println("The number entered is EQUAL to zero.");
    }
    else {
        System.out.println("The number entered is NOT EQUAL to zero.");
    }
    
    }
}