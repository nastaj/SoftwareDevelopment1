/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Guess1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            attempts++;
        }
        while (guess != number);
        
        input.close();
        System.out.println("Good guess. It is "+number+". It took you "+attempts+" attempts to guess the number.");

    }  
}