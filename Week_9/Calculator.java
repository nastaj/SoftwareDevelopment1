/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, result;
    char operator;

    System.out.println("Welcome to the Calculator");
    System.out.println("");

    System.out.print("Enter first number: ");
    a = input.nextInt();
    System.out.print("Enter second number: ");
    b = input.nextInt();
    System.out.println("");

    System.out.println("Choose your operation:");
    System.out.println("a - addition");
    System.out.println("s - substraction");
    System.out.println("m - multiplication");
    System.out.println("d - division");
    operator = input.next().charAt(0);
    System.out.println("");

    switch(operator) {
        case 'a':
            result = a+b;
            System.out.println(a+" + "+b+" = "+result);
            break;
        case 's':
            result = a-b;
            System.out.println(a+" - "+b+" = "+result);
            break;
        case 'm':
            result = a*b;
            System.out.println(a+" * "+b+" = "+result);
            break;
        case 'd':
            result = a/b;
            System.out.println(a+" / "+b+" = "+result);
            break;
        default:
            System.out.println("Error");
        }
    }
}