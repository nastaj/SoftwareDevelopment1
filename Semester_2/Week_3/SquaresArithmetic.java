/*
Program name: S2 Week 3 Lab
Description: Exercises for Semester 2 Week 3 Lab
Date: 10/02/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SquaresArithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += (i*i);
            i++;
        }

        System.out.println(sum);
    }
}