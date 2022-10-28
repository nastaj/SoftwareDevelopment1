/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 28/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class RunnersApp1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours;
        double minutes;
        double miles;
        double pace;
        double halfm;
        double m;

        System.out.println("Welcome to runners app.");
        System.out.println("");

        System.out.println("Enter number of hours first: ");
        hours = input.nextInt();
        System.out.println("");
        System.out.println("Enter number of minutes next: ");
        minutes = input.nextInt();
        System.out.println("");
        System.out.println("Finally enter the number of miles you ran: ");
        miles = input.nextDouble();
        System.out.println("");

        System.out.println("You ran "+miles+" miles in "+hours+" hours and "+minutes+" minutes.");
        System.out.println("Well done you!!!");
        System.out.println("");

        minutes = minutes + (hours * 60.0);
        pace = minutes/miles;
        halfm = pace*13.1;
        m = pace*26.2;

        System.out.println("Your pace was: "+Math.round(pace * 10.0)/10.0+" minutes per mile.");
        System.out.println("A half marathon would take you: "+Math.round(halfm * 10.0)/10.0+" minutes.");
        System.out.println("A marathon would take you: "+Math.round(m * 10.0)/10.0+" minutes.");

        
        
      
}
}