/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans;
    System.out.println("What will be the output of the following code?");
    System.out.println("====================================");
    System.out.println("");

    System.out.println("int x = 1;");
    System.out.println("int y = 2;");
    System.out.println("if (x == 1 && y == 2) {");
    System.out.println("    System.out.println(true);");
    System.out.println("} else {");
    System.out.println("    System.out.println(false);");

    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. false");
    System.out.println("2. true");
    System.out.println("3. no output");
    System.out.println("====================================");
    System.out.print("Select answer (1, 2 or 3): ");
    ans = input.nextInt();

    if (ans == 2) {
        System.out.println("Correct answer!");
    }
    else if (ans == 1 || ans == 3) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    }
}