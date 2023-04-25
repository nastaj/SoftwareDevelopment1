/*
Program name: S2 Week 14 Assessment
Description: Assessment 5
Date: 25/04/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a value (1 to 20): ");
        num = input.nextInt();

        if (num == 1) {
            System.out.println("Your team are League Champions and qualify for the Champions League.");
        }
        else if (num == 2  || num == 3 || num == 4) {
            System.out.println("Your team qualifies for the Champions League.");
        }
        else if (num == 5 || num == 6 || num == 7) {
            System.out.println("Your team qualifies for the Europa League.");
        }
        else if (num == 18 || num == 19 || num == 20) {
            System.out.println("Your team is relegated.");
        }
        else if (num > 7 && num < 18) {
            System.out.println("Your team qualifies for nothing but stays in the league.");
        }
        else {
            System.out.println("Not possible to finish in such position - it is a 20 team league.");
        }
    }
}