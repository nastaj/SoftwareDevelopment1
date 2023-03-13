/*
Program name: S2 Week 8 Lab
Description: Sample Assessments for S2 Week 8 Labs
Date: 13/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num >= 10 && num <= 20) {
            num+=10;
        }
        else if (num >= 30 && num <= 40) {
            num+=30;
        }
        else if (num >= 50 && num <= 60) {
            num+=50;
        }
        else {
            num+=100;
        }
        
        System.out.println("Number updated to: "+num);
    }
}