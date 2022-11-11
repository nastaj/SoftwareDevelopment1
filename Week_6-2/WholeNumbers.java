/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class WholeNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("Enter another number: ");
        b = input.nextInt();
        System.out.printf("Numbers entered were %d and %d%n", a, b);

    }
}