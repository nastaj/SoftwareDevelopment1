/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num >= 4 && num <= 8) {
            num*=6;
        }
        else if (num >= 10 && num <= 14) {
            num*=12;
        }
        else if (num >= 16 && num <= 20) {
            num*=18;
        }
        else if (num >= 22 && num <= 26) {
            num*=24;
        }
        else {
            num*=3;
        }
        
        System.out.println("Number updated to: "+num);
    }
}