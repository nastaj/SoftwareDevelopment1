/*
Program name: S2 Week 1 Lab
Description: Exercises for Semester 2 Week 1 Lab
Date: 24/01/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        num %= 2;

        if (num>0) {
            System.out.println("Number is odd.");
        }
        
        else {
            System.out.println("Number is even.");
        }

}
}