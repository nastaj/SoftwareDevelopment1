/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 28/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        String unit;
        double result;
        double resultRound;

        a = 3.1415926535;

        System.out.println("Enter the radius of the circle: ");
        b = input.nextInt();
        System.out.println("Enter the unit of measurment for the circle: ");
        unit = input.next();
        result = (b*b)*a;
        resultRound = Math.round(result * 100.0) / 100.0;
        System.out.println("Area of circle is "+resultRound+" "+unit);
      
}
}