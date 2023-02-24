/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class LoopCount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop;
        int loopAmount = 0;

        System.out.print("Want to loop: (0 for yes, 1 for no): ");
        loop = input.nextInt();

        while (loop != 1) {
            System.out.print("Loop Again: (0 for yes, 1 for no): ");
            loop = input.nextInt();
            loopAmount++;
        }
        
        System.out.println();
        System.out.println("You looped: "+loopAmount+" times.");
        input.close();
    }  
}