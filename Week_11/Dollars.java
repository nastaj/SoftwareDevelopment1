/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Dollars{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double rate, amount, convertAmount;

    System.out.print("Enter the current Euro to US Dollar conversion rate: ");
    rate = input.nextDouble();
    System.out.print("Enter the amount of Euro to convert to US Dollars: ");
    amount = input.nextDouble();

    convertAmount = amount*rate;
    convertAmount = Math.round(convertAmount*100.0)/100.0;

    System.out.println("");
    System.out.println(amount+" euro will get you: "+convertAmount+" US Dollars.");

    }
}