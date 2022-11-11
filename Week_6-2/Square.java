/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Square{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value;
        int area;
        int perimeter;

        System.out.println("Enter single digit value for length and width: ");
        value = input.nextInt();
        area = value*value;
        perimeter = 4*value;

        System.out.println("Area of square is: "+area);
        System.out.println("Perimeter of square is: "+perimeter);
        System.out.println("");

        System.out.println("********************");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("*  Area:       "+area+"  *");
        System.out.println("*  Perimeter:  "+perimeter+"  *");
        System.out.println("*                  *");
        System.out.println("*                  *");
        System.out.println("********************");              
    }
}