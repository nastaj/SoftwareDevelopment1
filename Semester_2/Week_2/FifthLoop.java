/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FifthLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int value = 1;
        int counter;
        
        System.out.print("Enter a counter value: ");
        counter = input.nextInt();
        System.out.println();

        while (i < counter) {
            System.out.println("Loop counter: "+value);
            i++;
            value++;
        }
}
}