/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Dice{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter number between 1 and 6: ");
    num = input.nextInt();

    if (num==1) {
        System.out.println("|       |");
        System.out.println("|   *   |");
        System.out.println("|       |");
    }
    else if (num==2) {
        System.out.println("|     * |");
        System.out.println("|       |");
        System.out.println("| *     |");
    }
    else if (num==3) {
        System.out.println("|     * |");
        System.out.println("|   *   |");
        System.out.println("| *     |");
    }
    else if (num==4) {
        System.out.println("| *   * |");
        System.out.println("|       |");
        System.out.println("| *   * |");
    }
    else if (num==5) {
        System.out.println("| *   * |");
        System.out.println("|   *   |");
        System.out.println("| *   * |");
    }
    else if (num==6) {
        System.out.println("| *   * |");
        System.out.println("| *   * |");
        System.out.println("| *   * |");
    }
    else {
        System.out.println("Invalid choice. Must enter a value from 1 to 6.");
    }
    }
}