/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    static void calcNums(int a, int b, int c) {
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
        System.out.println(a+" * "+b+" * "+c+" = "+(a*b*c));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.print("Enter third number: ");
        c = input.nextInt();

        System.out.println();

        calcNums(a, b, c);
    }
}

