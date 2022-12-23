/*
Program name: Exercise3
Description: Java Lab Practical Assessment
Date: 20/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num<10) {
            System.out.println("Number is less than 10.");
        }

        else {
            System.out.println("Number is not less than 10.");
        }
    }
}