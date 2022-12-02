/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NumberRange{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num>=10 && num<=20) {
        System.out.println("Number entered is in the range of 10 to 20.");
    }

    else {
        System.out.println("Number entered is not in the range of 10 to 20.");
    }

    }
}