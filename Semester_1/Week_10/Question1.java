/*
Program name: Week 10
Description: Exercises for Week 10
Date: 06/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans;
    System.out.println("The following code produces which output to the screen:");
    System.out.println("====================================");
    System.out.println("");

    System.out.println("int x = 65;");
    System.out.println("if(x > 65){");
    System.out.println("        System.out.println(x);");
    System.out.println("}");

    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. 65");
    System.out.println("2. Nothing is printed to the screen");
    System.out.println("====================================");
    System.out.print("Select answer (1 or 2): ");
    ans = input.nextInt();

    if (ans == 2) {
        System.out.println("Correct answer!");
    }
    else if (ans == 1) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    }
}