/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 21/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class InputString{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter your first name: ");
        name = input.next();
        System.out.println("Hello "+name);
}
}