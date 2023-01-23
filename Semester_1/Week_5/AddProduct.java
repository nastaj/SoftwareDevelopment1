/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 28/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class AddProduct{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int add;
        int multi;

        System.out.println("Enter first integer: ");
        a = input.nextInt();
        System.out.println("Enter second integer: ");
        b = input.nextInt();
        System.out.println("Enter third integer: ");
        c = input.nextInt();
        add = a + b + c;
        multi = a * b * c;
        System.out.println(a+" + "+b+" + "+c+" = "+add);
        System.out.println(a+" * "+b+" * "+c+" = "+multi);
      
}
}