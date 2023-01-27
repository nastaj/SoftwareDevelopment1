/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 27/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "First";
        String b = "Second";
         
        System.out.println("Strings before swap: a = " +a+ " and b = "+b);
        
        a = a + b;

        b = a.substring(0,a.length()-b.length());
         
        a = a.substring(b.length());
         
        System.out.println("Strings after swap: a = " +a+ " and b = "+b);
}
}