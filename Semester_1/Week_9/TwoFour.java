/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwoFour{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b;

    System.out.print("Enter first number: ");
    a = input.nextInt();
    System.out.print("Enter second number: ");
    b = input.nextInt();

    if ((a==2 && b==4) || (a==4 && b==2)) {
        System.out.println("Both numbers are either 2 or 4.");
    }

    else if (a==2 || a==4 || b==2 || b==4) {
        System.out.println("One number is either 2 or 4.");
    }

    else {
        System.out.println("No numbers are either 2 or 4.");
    }

}
}