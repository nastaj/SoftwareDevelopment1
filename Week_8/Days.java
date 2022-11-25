/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Days{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Input number: ");
    num = input.nextInt();

    if (num<1) {
        System.out.println("Number is less than 1");
    }
    if (num>7) {
        System.out.println("Number is greater than 7");
    }
    if (num==1) {
        System.out.println("Monday");
    }
    if (num==2) {
        System.out.println("Tuesday");
    }
    if (num==3) {
        System.out.println("Wednesday");
    }
    if (num==4) {
        System.out.println("Thursday");
    }
    if (num==5) {
        System.out.println("Friday");
    }
    if (num==6) {
        System.out.println("Saturday");
    }
    if (num==7) {
        System.out.println("Sunday");
    }

    }
}