/*
Program name: Week 9
Description: Exercises for Week 9
Date: 29/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Sign{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Input number: ");
    num = input.nextInt();

    if (num==0) {
        System.out.println("Number is zero.");
    }
    else if (num>0) {
        System.out.println("Number is positive.");
    }
    else {
        System.out.println("Number is negative.");
    }

    }
}