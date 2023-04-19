/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    static void calcNums(int a, int b) {
        System.out.println("("+a+" + "+b+") * 4 = "+((a+b)*4));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();

        calcNums(a, b);
    }
}

