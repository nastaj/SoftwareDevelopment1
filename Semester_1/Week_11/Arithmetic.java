/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int firstNumber, secondNumber, thirdNumber, fourthNumber, add, substr;

    System.out.print("Enter first number: ");
    firstNumber = input.nextInt();
    System.out.print("Enter second number: ");
    secondNumber = input.nextInt();
    System.out.print("Enter third number: ");
    thirdNumber = input.nextInt();
    System.out.print("Enter fourth number: ");
    fourthNumber = input.nextInt();

    add = firstNumber+secondNumber+thirdNumber+fourthNumber;
    substr = fourthNumber-firstNumber;

    System.out.println("");
    System.out.println(firstNumber+" + "+secondNumber+" + "+thirdNumber+" + "+fourthNumber+" = "+add);
    System.out.println(fourthNumber+" - "+firstNumber+" = "+substr);
    }
}