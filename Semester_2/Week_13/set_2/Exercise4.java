/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char symbol;

        System.out.print("Enter a symbol: ");
        symbol = input.next().charAt(0);

        System.out.println();
        
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 5; cols++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}

