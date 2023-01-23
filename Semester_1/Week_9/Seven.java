/*
Program name: Week 9
Description: Exercises for Week 9
Date: 29/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Seven{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    if (num==7) {
        System.out.println("Number entered, "+num+" is equal to 7.");
    }
    else {
        System.out.println("Number entered, "+num+" is not equal to 7.");
    }

    }
}