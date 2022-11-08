/*
Program name: Week 6
Description: Revision for Week 6
Date: 08/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwoDecimalsInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Enter a decimal number - e.g 12.57");
        System.out.println("Enter a decimal number: ");
        a = input.nextDouble();
        System.out.println("Enter another decimal number: ");
        b = input.nextDouble();

        System.out.println("Decimal numbers you entered are: "+a+" and "+b+".");
}
}