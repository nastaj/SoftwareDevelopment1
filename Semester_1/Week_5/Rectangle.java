/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 28/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        String unit;
        int result;

        System.out.println("Enter the length of the rectangle: ");
        a = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        b = input.nextInt();
        System.out.println("Enter the unit of measurment of the rectangle: ");
        unit = input.next();
        result = a * b;
        System.out.println("Area of rectangle is "+result+ " "+unit+" square.");
        
      
}
}