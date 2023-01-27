/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;

        System.out.print("Enter a number for a: ");
        a = input.nextInt();

        System.out.print("Enter a number for b: ");
        b = input.nextInt();

        System.out.print("Enter a number for c: ");
        c = input.nextInt();

        System.out.print("Enter a number for d: ");
        d = input.nextInt();
        
        System.out.print("Enter a number for e: ");
        e = input.nextInt();

        System.out.println();

        System.out.println("Value of a, "+a+", after adding 9 is: "+(a+=9));
        System.out.println("Value of b, "+b+", after substracting 4 is: "+(b-=4));
        System.out.println("Value of c, "+c+", after multiplying by 3 is: "+(c*=3));
        System.out.println("Value of d, "+d+", after dividing by 2 is: "+(d/=2));
        System.out.println("Remainder value assigned to e, "+e+", after dividing e by 5: "+(e%=5));
}
}