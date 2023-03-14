/*
Program name: S2 Week 8 Assessment
Description: Assessment for S2 Week 8
Date: 14/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num >= 5 && num <= 12) {
            num-=5;
        }
        else if (num >= 25 && num <= 32) {
            num-=25;
        }
        else if (num >= 45 && num <= 52) {
            num-=45;
        }
        else {
            num-=2;
        }
        
        System.out.println("Number updated to: "+num);
    }
}