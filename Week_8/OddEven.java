/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter integer: ");
    num = input.nextInt();

    if (num%2==0) {
        System.out.println("Number is even");
    }

    if (num%2>0) {
        System.out.println("Number is odd");
    }

    }
}