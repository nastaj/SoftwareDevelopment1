/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class AddWhat{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num, newNum;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num>100) {
        newNum = num+10;
        System.out.println(num+" + 10 = "+newNum);
    }
    else if (num>=50 && num<=100) {
        newNum = num+20;
        System.out.println(num+" + 20 = "+newNum);
    }
    else {
        newNum= num+30;
        System.out.println(num+" + 30 = "+newNum);
    }
    
    }
}