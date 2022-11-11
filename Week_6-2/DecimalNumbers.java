/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class DecimalNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double a;
        Double b;

        System.out.println("Enter a number: ");
        a = input.nextDouble();
        System.out.println("Enter another number: ");
        b = input.nextDouble();
        System.out.printf("Numbers entered were %.1f and %.1f%n", a, b);

    }
}