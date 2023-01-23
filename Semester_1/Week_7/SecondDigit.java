/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class SecondDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit, secondDigit;

        System.out.print("Enter a four digit number: ");
        digit = input.nextInt();

        secondDigit = digit%1000/100;
        System.out.println("Second digit is: "+secondDigit);
    }
}