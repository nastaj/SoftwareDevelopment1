/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Last{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value;
        char lastChar;

        System.out.print("Enter a value: ");
        value = input.next();

        lastChar = value.charAt(value.length()-1);

        System.out.println("Last character of '"+value+"' is: "+lastChar);


}
}