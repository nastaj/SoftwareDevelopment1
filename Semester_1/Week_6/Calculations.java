/*
Program name: Week 6
Description: Revision for Week 6
Date: 08/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Calculations{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x;
        int y;
        double addition;
        double multiplication;
        double multiplicationRound;

        System.out.println("Enter a decimal number for x - e.g 12.57: ");
        x = input.nextDouble();
        System.out.println("Enter a whole number for y - e.g 7: ");
        y = input.nextInt();

        addition = x + y;
        multiplication = x * y;
        multiplicationRound = Math.round(multiplication * 100.0) / 100.0;

        System.out.println("x + y = "+addition);
        System.out.println("x * y = "+multiplicationRound);
}
}