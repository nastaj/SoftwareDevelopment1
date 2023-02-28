/*
Program name: S2 Week 6 Lab
Description: Exercises for Semester 2 Week 6 Lab
Date: 28/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Guess2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;
        int guess;
        int attempts = 0;
        String cont;

        do {
            do {
                System.out.print("Guess the number: ");
                guess = input.nextInt();
                attempts++;
            }
            while (guess != number);

            System.out.println("Good guess. It is "+number+". It took you "+attempts+" attempts to guess the number.");
            System.out.print("Play again (y/n)?: ");
            cont = input.next();
            attempts = 0;
        }
        while (cont.equals("y"));

        input.close();
        System.out.println("Game Over");
    }  
}