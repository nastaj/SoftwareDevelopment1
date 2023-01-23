/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Quiz2{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans1, ans3, ans4, ans5, ans6, ans7, ans8, score;
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
        System.out.println("Wrong value entered.");
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
        System.out.println("Wrong value entered.");
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
            System.out.println("Wrong value entered.");
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
        System.out.println("Wrong value entered.");
    }

    System.out.println("");
    System.out.println("Say that value has a value of 19 assigned to it, and that extra has a value of 25 assigned to it. Evaluate (to true or false) each of the following expressions:");
    System.out.println("====================================");
    System.out.println("");
    System.out.println("value >= extra      extra < value       value > -25     value <= extra");
    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. true   false   true   false");
    System.out.println("2. true   true   true   false");
    System.out.println("3. false   false   true   false");
    System.out.println("4. false   false   true   true");
    System.out.println("====================================");
    System.out.print("Select answer (1, 2, 3 or 4): ");
    ans6 = input.nextInt();

    switch (ans6) {
        case 1:
        case 2:
        case 3:
            System.out.println("Wrong answer.");
            break;

        case 4:
            System.out.println("Correct answer!");
            total = total+1;
            break;

        default:
            System.out.println("Wrong value entered.");
    }

    System.out.println("");
    System.out.println("What does the following code fragment write to the screen?");
    System.out.println("====================================");
    System.out.println("");

    System.out.println("boolean x = true;");
    System.out.println("boolean y = false;");
    System.out.println("if (x && y) {");
    System.out.println("    System.out.println(true);");
    System.out.println("} else {");
    System.out.println("    System.out.println(false);");

    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. false");
    System.out.println("2. true");
    System.out.println("====================================");
    System.out.print("Select answer (1 or 2): ");
    ans7 = input.nextInt();

    if (ans7 == 1) {
        System.out.println("Correct answer!");
        total = total+1;
    }
    else if (ans7 == 2) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered.");
    }

    System.out.println("");
    System.out.println("What does the following code fragment write to the screen?");
    System.out.println("====================================");
    System.out.println("");

    System.out.println("boolean x = true;");
    System.out.println("boolean y = false;");
    System.out.println("if (x || y) {");
    System.out.println("    System.out.println(true);");
    System.out.println("} else {");
    System.out.println("    System.out.println(false);");

    System.out.println("");
    System.out.println("====================================");
    System.out.println("1. true");
    System.out.println("2. false");
    System.out.println("====================================");
    System.out.print("Select answer (1 or 2): ");
    ans8 = input.nextInt();

    switch (ans8) {
        case 2:
            System.out.println("Wrong answer.");
            break;

        case 1:
            System.out.println("Correct answer!");
            total = total+1;
            break;

        default:
            System.out.println("Wrong value entered.");
    }

    score = (total * 100)/8;
    System.out.println("");
    System.out.println("Total score: "+score+"%");
    
         if (score>=85) {
            System.out.println("You acquired an A.");
         }

         else if (score>=70) {
            System.out.println("You acquired a B.");
         }

         else if (score>=60) {
            System.out.println("You acquired a C.");
         }

         else if (score>=50) {
            System.out.println("You acquired a D.");
         }

        else {
            System.out.println("You acquired an F. Try again.");
        }
    }
}