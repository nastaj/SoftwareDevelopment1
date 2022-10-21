/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 21/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class InputNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");
        number = input.nextInt();
        System.out.println("Number entered is: "+number);
}
}