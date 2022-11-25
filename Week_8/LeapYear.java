/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int year;

    System.out.print("Enter a numer for year: ");
    year = input.nextInt();

    if (year%4==0) {
        System.out.println(year+" is a leap year.");
        System.out.println("Which means february has 29 days in that year.");
    }
    if (year%4>0) {
        System.out.println(year+" is not a leap year.");
    }

    }
}