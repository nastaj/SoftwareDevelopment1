/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Quiz1{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans1, ans3, ans4, ans5, score;
    int total = 0;
    String ans2;

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
    ans1 = input.nextInt();
    input.nextLine();

    if (ans1 == 2) {
        System.out.println("Correct answer!");
        total = total+1;
    }

    else if (ans1 == 1) {
        System.out.println("Wrong answer.");
    }

    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    System.out.println("");
    System.out.println("Write a line of java code to assign an instance of the Scanner object for user input to a variable named sc");
    System.out.println("====================================");
    System.out.print("Answer: ");
    ans2 = input.nextLine();

    switch (ans2) {
        case "Scanner sc = new Scanner(System.in);":
            System.out.println("Correct answer!");
            total = total+1;
            break;
        default:
            System.out.println("Wrong answer.");
    }

    System.out.println("");
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
    ans3 = input.nextInt();

    if (ans3 == 2) {
        System.out.println("Correct answer!");
        total = total+1;
    }
    else if (ans3 == 1 || ans3 == 3) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    System.out.println("");
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
    ans4 = input.nextInt();

    switch (ans4) {
        case 1:
        case 3:
        case 4:
            System.out.println("Wrong answer.");
            break;

        case 2:
            System.out.println("Correct answer!");
            total = total+1;
            break;

        default:
            System.out.println("Wrong value entered. Please try again.");
    }

    System.out.println("");
    System.out.println("How many choices are possible when using a single if-else statement?");
    System.out.println("====================================");
    System.out.println("1. 1");
    System.out.println("2. 2");
    System.out.println("3. 3");
    System.out.println("4. 4");
    System.out.println("====================================");
    System.out.print("Select answer (1, 2, 3 or 4): ");
    ans5 = input.nextInt();

    if (ans5 == 2) {
        System.out.println("Correct answer!");
        total = total+1;
    }
    else if (ans5 == 1 || ans5 == 3 || ans5 == 4) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    score = (total * 100)/5;
    System.out.println("");
    System.out.println("Total score: "+score+"%");
    
         if (score>=80) {
            System.out.println("You acquired a Distinction. Well done!");
         }

         else if (score>=40) {
            System.out.println("You acquired a Pass.");
         }

         else {
            System.out.println("You have failed the Quiz. Try again.");
         }
    }
}