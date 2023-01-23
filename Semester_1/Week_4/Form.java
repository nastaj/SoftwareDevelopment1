/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 21/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Form{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String phone;
        String email;

        System.out.println("Your name: ");
        name = input.next();
        System.out.println("Phone number: ");
        phone = input.next();
        System.out.println("Your email: ");
        email = input.next();

        System.out.println("-========================================-");
        System.out.println("-                   GMIT                 -");
        System.out.println("-========================================-");
        System.out.println("- Name:           - "+name+"                -");
        System.out.println("------------------------------------------");
        System.out.println("- Phone Number:   - ("+phone.substring(0, 3)+") "+phone.substring(4)+"          -");
        System.out.println("------------------------------------------");
        System.out.println("- Email:          - "+email+"        -");
        System.out.println("------------------------------------------");
    } 
}