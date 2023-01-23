/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String ans;

    System.out.println("Write a line of java code to assign an instance of the Scanner object for user input to a variable named sc");
    System.out.println("====================================");
    System.out.print("Answer: ");
    ans = input.nextLine();

    switch (ans) {
        case "Scanner sc = new Scanner(System.in);":
            System.out.println("Correct answer!");
            break;
        default:
            System.out.println("Wrong answer.");
    }

    }
}