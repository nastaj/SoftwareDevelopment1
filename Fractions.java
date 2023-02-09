/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 10/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Fractions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double sum = 0;
        int i = 0;
        double term = 1.0;

        while (i <= 10) {
            sum = sum + term;
            term = 0.5*term;
            i++;
        }
        
        System.out.println(sum);
    }
}