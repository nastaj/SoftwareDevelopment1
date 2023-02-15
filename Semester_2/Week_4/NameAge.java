/*
Program name: S2 Week 4 Lab
Description: Exercises for Semester 2 Week 4 Lab
Date: 13/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NameAge{
    public static void main(String[] args) {
        // WHILE
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        // int i = 1;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // while (i <= age) {
        //     System.out.println(i+". "+name);
        //     i++;
        // }

        //FOR
        for (int i = 1; i <= age; i++) {
            System.out.println(i+". "+name);
        }


    }

   
}