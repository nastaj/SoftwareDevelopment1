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

    if (num>1000000) {
        System.out.println("The number entered IS GREATER than 1,000,000.");
    }
    else {
        System.out.println("The number entered IS NOT GREATER than 1,000,000.");
    }
    
    }
}