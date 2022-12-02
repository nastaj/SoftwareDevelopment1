/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Bonus{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int wage, bwage;
    char grade;

    System.out.print("Enter your weekly wage: ");
    wage = input.nextInt();
    System.out.print("Enter your grade (A, B or C): ");
    grade = input.next().charAt(0);

    //grade = grade.charAt(0);

    switch(grade) {
        case 'A':
            bwage = wage+100;
            System.out.println("You receive an extra 100-euro bonus!");
            System.out.println("Your wage is now: "+bwage);
            break;
        case 'B':
            bwage = wage+50;
            System.out.println("You receive an extra 50-euro bonus!");
            System.out.println("Your wage is now: "+bwage);
            break;
        case 'C':
            bwage = wage+10;
            System.out.println("You receive an extra 10-euro bonus!");
            System.out.println("Your wage is now: "+bwage);
            break;
        default:
            System.out.println("You do not receive any extra bonus.");
            System.out.println("Your wage is now: "+wage);
        }
    }
}