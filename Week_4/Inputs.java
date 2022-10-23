/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 21/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Inputs{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int integer;
        double decimal;

        System.out.println("Enter your first name: ");
        name = input.next();
        System.out.println("Enter a whole number: ");
        integer = input.nextInt();
        System.out.println("Enter a decimal number: ");
        decimal = input.nextDouble();
        System.out.println(name+", you entered the numbers "+integer+" and "+decimal+".");
}
}