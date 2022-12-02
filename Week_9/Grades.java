/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Grades{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int q1, q2, q3, avg;

    System.out.println("Welcome to the Grades Calculator.");
    System.out.println("");
    System.out.print("Enter a score for Quiz 1: ");
    q1 = input.nextInt();
    System.out.print("Enter a score for Quiz 2: ");
    q2 = input.nextInt();
    System.out.print("Enter a score for Quiz 3: ");
    q3 = input.nextInt();

    avg = (q1+q2+q3)/3;

    if (avg>=90) {
        System.out.println("Grade assigned is: A");
    }
    else if (avg>=70 && avg<90) {
        System.out.println("Grade assigned is: B");
    }
    else if (avg>=50 && avg<70) {
        System.out.println("Grade assigned is: C");
    }
    else {
        System.out.println("Grade assigned is: F");
    }

    }
}