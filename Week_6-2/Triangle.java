/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double h;
        double result;

        System.out.println("Enter the length of the base of the triangle: ");
        a = input.nextInt();
        System.out.println("Enter the height of the triangle: ");
        h = input.nextInt();

        result = 0.5*a*h;

        System.out.println("               *               ");
        System.out.println("              ***              ");
        System.out.println("            *** ***            ");
        System.out.println("          ***     ***          ");
        System.out.println("        ***         ***        ");
        System.out.println("      ***             ***      ");
        System.out.println("    ***                 ***    ");
        System.out.println("  ***                     ***  ");
        System.out.println(" ***************************** ");
        System.out.println("           Area: "+result+"      ");
        System.out.println("*******************************");

    }
}