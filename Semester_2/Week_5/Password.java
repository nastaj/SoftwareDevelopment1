/*
Program name: S2 Week 5 Lab
Description: Exercises for Semester 2 Week 5 Lab
Date: 24/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Password{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = input.next();
        }
        while (!password.equals("mypass"));
        System.out.println("Access granted!");
        input.close();        
    }  
}