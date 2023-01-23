/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class AllDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit, firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit;

        System.out.print("Enter a five-digit number: ");
        digit = input.nextInt();

        firstDigit = digit/10000;
        secondDigit = digit%10000/1000;
        thirdDigit = digit%10000%1000/100;
        fourthDigit = digit%10000%1000%100/10;
        fifthDigit = digit%10;
        System.out.println("Digits in "+digit+" are: "+firstDigit+"   "+secondDigit+"   "+thirdDigit+"   "+fourthDigit+"   "+fifthDigit);
    }
}