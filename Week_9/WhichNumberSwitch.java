/*
Program name: Week 9
Description: Exercises for Week 9
Date: 29/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class WhichNumberSwitch{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter a number: ");
    num = input.nextInt();

    switch (num) {
        case 0:
            System.out.println(num);
            break;
        case 1:
            System.out.println(num);
            break;
        case 2:
            System.out.println(num);
            break;
        case 3:
            System.out.println(num);
            break;
        default:
            System.out.println("Not allowed");
    }

    }
}