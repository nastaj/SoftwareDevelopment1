/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Circle{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double diameter;
        double circum;
        double circumRound;

        System.out.println("Please enter radius value of a circle: ");
        radius = input.nextInt();

        diameter = 2*radius;
        circum = 2*3.14*radius;
        circumRound = Math.round(circum * 10.0) / 10.0;

        System.out.println("+-------------------------+");
        System.out.println("+ Diameter: "+diameter+"           +");
        System.out.println("+-------------------------+");
        System.out.println("+ Circumference: "+circumRound+"             +");
        System.out.println("+-------------------------+");
            
    }
}