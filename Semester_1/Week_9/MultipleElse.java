/*
Program name: Week 9
Description: Exercises for Week 9
Date: 29/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class MultipleElse{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b;

    System.out.print("Enter first number: ");
    a = input.nextInt();
    System.out.print("Enter second number: ");
    b = input.nextInt();

    if (a%b==0) {
        System.out.println(a+" is a multiple of "+b+".");
    }
    else {
        System.out.println(a+" is not a multiple of "+b+".");
    }

    }
}