/*
Program name: Week 6
Description: Revision for Week 6
Date: 08/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwoNumbersInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("Enter another number: ");
        b = input.nextInt();

        System.out.println("Numbers you entered are: "+a+" and "+b+".");
}
}