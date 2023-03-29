/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Square{
    static int squareOf(int number) {
        return (int)Math.pow(number, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number\tSquare");
        System.out.println("++++++\t++++++");
        for (int i = 2; i <= 7; i++) {
            System.out.println(i+"\t"+squareOf(i));
        }
    }
}

