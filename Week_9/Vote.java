/*
Program name: Week 9
Description: Exercises for Week 9
Date: 29/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Vote{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int age;

    System.out.print("Enter your age: ");
    age = input.nextInt();

    if (age>=18) {
        System.out.println("You are eligible to vote.");
    }
    else {
        System.out.println("You are not eligible to vote.");
    }

    }
}