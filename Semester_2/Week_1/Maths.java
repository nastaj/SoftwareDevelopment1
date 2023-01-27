/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Maths{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, operation, result;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.println("What arithmetic do you want to perform on these numbers?");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1 - 4): ");
        operation = input.nextInt();

        switch (operation) {
            case 1:
            result = a+b;
            System.out.println(a+" + "+b+" = "+result);
            break;

            case 2:
            result = a-b;
            System.out.println(a+" - "+b+" = "+result);
            break;

            case 3:
            result = a*b;
            System.out.println(a+" * "+b+" = "+result);
            break;

            case 4:
            result = a/b;
            System.out.println(a+" / "+b+" = "+result);
            break;

            default:
            System.out.println("Invalid choice.");
        }
}
}