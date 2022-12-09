/*
Program name: Week 10
Description: Exercises for Week 10
Date: 09/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Question5{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ans;
    System.out.println("How many choices are possible when using a single if-else statement?");
    System.out.println("====================================");
    System.out.println("1. 1");
    System.out.println("2. 2");
    System.out.println("3. 3");
    System.out.println("4. 4");
    System.out.println("====================================");
    System.out.print("Select answer (1, 2, 3 or 4): ");
    ans = input.nextInt();

    if (ans == 2) {
        System.out.println("Correct answer!");
    }
    else if (ans == 1 || ans == 3 || ans == 4) {
        System.out.println("Wrong answer.");
    }
    else {
        System.out.println("Wrong value entered. Please try again.");
    }

    }
}