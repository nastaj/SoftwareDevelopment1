/*
Program name: Exercise4
Description: Java Lab Practical Assessment
Date: 20/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.println();

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

        System.out.println();

        System.out.println("Numbers input: "+num1+", "+num2+", "+num3+", "+num4+", "+num5);
        if (num1>=num2 && num1>=num3 && num1>=num4 && num1>=num5) {
            System.out.println("Largest number is: "+num1);
        }

        else if (num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5 ) {
            System.out.println("Largest number is: "+num2);
        }

        else if (num3>=num1 && num3>=num2 && num3>=num4 && num3>=num5) {
            System.out.println("Largest number is: "+num3);
        }

        else if (num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5) {
            System.out.println("Largest number is: "+num4);
        }

        else if (num5>=num1 && num5>=num2 && num5>=num3 && num5>=num4) {
            System.out.println("Largest number is: "+num5);
        }

        if (num1<=num2 && num1<=num3 && num1<=num4 && num1<=num5) {
            System.out.println("Smallest number is: "+num1);
        }

        else if (num2<=num1 && num2<=num3 && num2<=num4 && num2<=num5 ) {
            System.out.println("Smallest number is: "+num2);
        }

        else if (num3<=num1 && num3<=num2 && num3<=num4 && num3<=num5) {
            System.out.println("Smallest number is: "+num3);
        }

        else if (num4<=num1 && num4<=num2 && num4<=num3 && num4<=num5) {
            System.out.println("Smallest number is: "+num4);
        }

        else if (num5<=num1 && num5<=num2 && num5<=num3 && num5<=num4) {
            System.out.println("Smallest number is: "+num5);
        }
    }
}