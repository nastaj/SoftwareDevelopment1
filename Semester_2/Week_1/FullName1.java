/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FullName1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname, sname;

        System.out.print("Enter first name: ");
        fname = input.next();

        System.out.print("Enter surname: ");
        sname = input.next();

        System.out.println("Full name: "+fname.concat(" "+sname));
}
}