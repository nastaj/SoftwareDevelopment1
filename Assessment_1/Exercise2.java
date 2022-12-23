/*
Program name: Exercise2
Description: Java Lab Practical Assessment
Date: 20/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String fname;
        int age;
        double eur_ster;
        double conversion;

        System.out.println();
        System.out.print("Enter first name: ");
        fname = input.next();

        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.print("Enter euro to sterling conversion rate: ");
        eur_ster = input.nextDouble();

        conversion = age*eur_ster;
        System.out.println(fname+" you are "+age+" years of age.");


        System.out.println("If you had a euro for each year of your life, it would be worth "+conversion+" pounds sterling.");
    }
}