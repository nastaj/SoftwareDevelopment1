/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Increment{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 10;

        System.out.println("Number post increment: "+num);
        System.out.println("Post increment number: "+(num++));
        System.out.println("Number after post increment: "+num);

        System.out.println();

        num = 10;
        System.out.println("Number before pre increment: "+num);
        System.out.println("Pre increment number: "+(++num));
        System.out.println("Number after post increment: "+num);
}
}