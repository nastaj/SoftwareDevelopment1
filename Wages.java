/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 07/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Wages{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        double hoursWorked, hourlyRate, wage;

        while (i <= 3) {
            System.out.print("Enter hours worked: ");
            hoursWorked = input.nextDouble();
            System.out.print("Enter hourly rate: ");
            hourlyRate = input.nextDouble();

            if (hoursWorked > 40) {
                wage = 40.0 * hourlyRate + 1.5 * hourlyRate * (hoursWorked - 40.0);
            }
            else {
                 wage = hoursWorked*hourlyRate;
            }

            System.out.println("Pay for Employee "+i+" is: "+wage);
            System.out.println();

            i++;
        }
    }
}