/*
Program name: S2 Week 2 Lab
Description: Exercises for Semester 2 Week 2 Lab
Date: 31/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NinthLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int number = 0;
        int square = 0;
        int cube = 0;

        System.out.println("Number   Square   Cube");
        while (i <= 10) {
            square = (number*number);
            cube = (number*number*number);
            System.out.println(number+"        "+square+"      "+cube);
            i++;
            number++;
        }

    }
}