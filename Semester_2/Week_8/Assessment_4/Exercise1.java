/*
Program name: S2 Week 8 Assessment
Description: Assessment for S2 Week 8
Date: 14/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5, result;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        num4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        num5 = input.nextInt();

        result = (num1*num2*num3*num4*num5);

        System.out.println(num1+" * "+num2+" * "+num3+" * "+num4+" * "+num5+" = "+result);
    }
}