/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class EleventhLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int product = 1;
        int i = 1;

        while (i <= 10) {
            product = product * i;
            i++;
        }

        System.out.println("The product of numbers from 1 to 10 is: "+product);
    }
}