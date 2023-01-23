/*
Program name: Week 10
Description: Exercises for Week 10
Date: 06/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Name{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name;
    String myName = "Jakub";

    System.out.print("Enter name: ");
    name = input.next();

    if (name.equals(myName)) {
        System.out.println("Name match found!");
    }
    else {
        System.out.println("Name match not found.");
    }

    }
}