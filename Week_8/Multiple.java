/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Multiple{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b;

    System.out.print("Enter first number: ");
    a = input.nextInt();
    System.out.print("Enter second number: ");
    b = input.nextInt();

    if (a%b==0) {
        System.out.println(a+" is a multiple of "+b);
    }

    if (a%b>0) {
        System.out.println(a+" is not a multiple of "+b);
    }

    }
}