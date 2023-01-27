/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Maths{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter your name: ");
        name = input.next();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age<4) {
            System.out.println(name+", you are a toddler.");
        }

        else if (age>=3 && age<=13) {
            System.out.println(name+", you are a child.");
        }

         else if (age>12 && age<20) {
            System.out.println(name+", you are a teenager.");
        }

        else if (age>19 && age<66) {
            System.out.println(name+", you are an adult.");
        }

        else {
            System.out.println(name+", you are a senior citizen.");
        }

}
}