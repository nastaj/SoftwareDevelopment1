/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class FirstDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit;
        int firstDigit;

        System.out.print("Enter a four digit number: ");
        digit = input.nextInt();

        firstDigit = digit/1000;
        System.out.println("First digit is: "+firstDigit);
    }
}