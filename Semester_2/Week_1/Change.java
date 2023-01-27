/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Change{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiftyC, twentyC, tenC, fiveC, cents;
        double total;

        System.out.print("Enter the number of 50 cent coins: ");
        fiftyC = input.nextInt();

        System.out.print("Enter the number of 20 cent coins: ");
        twentyC = input.nextInt();

        System.out.print("Enter the number of 10 cent coins: ");
        tenC = input.nextInt();

        System.out.print("Enter the number of 5 cent coins: ");
        fiveC = input.nextInt();

        cents = (fiftyC*50)+(twentyC*20)+(tenC*10)+(fiveC*5);
        total = cents/100.0;

        System.out.println("Total amount of money: "+total);

}
}