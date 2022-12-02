/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class WhichNumber{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num==0) {
        System.out.println(num);
    }
    
    else if (num==1) {
        System.out.println(num);
    }

    else if (num==2) {
        System.out.println(num);
    }

    else if (num==3) {
        System.out.println(num);
    }

    else {
        System.out.println("Not allowed");
    }

    }
}