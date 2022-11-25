/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Sign{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Input number: ");
    num = input.nextInt();

    if (num>0) {
        System.out.println("Number is positive");
    }

    if (num==0) {
        System.out.println("Number is equal to 0");
    }

    if (num<0) {
        System.out.println("Number is negative");
    }


    }
}