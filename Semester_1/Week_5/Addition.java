/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 25/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int sum;

        System.out.println("Enter first integer: ");
        a = input.nextInt();
        System.out.println("Enter second integer: ");
        b = input.nextInt();
        sum = a + b;
        System.out.println(a+" + "+b+" = "+sum);
      
}
}