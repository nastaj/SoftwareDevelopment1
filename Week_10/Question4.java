/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans;
    System.out.println("What will be the output of the following code?");
    System.out.println("====================================");
    System.out.println("");

    System.out.println("int x = 1;");
    System.out.println("");
    System.out.println("if (x != 1) {");
    System.out.println("    System.out.println('not equal to 1');");
    System.out.println("} else {");
    System.out.println("    System.out.println('equal to 1');");

    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. not equal to 1");
    System.out.println("2. equal to 1");
    System.out.println("3. no output");
    System.out.println("4. error");
    System.out.println("====================================");
    System.out.print("Select answer (1, 2, 3 or 4): ");
    ans = input.nextInt();

    switch (ans) {
        case 1:
        case 3:
        case 4:
            System.out.println("Wrong answer.");
            break;

        case 2:
            System.out.println("Correct answer!");
            break;

        default:
            System.out.println("Wrong value entered. Please try again.");
    }
   
    }
    }