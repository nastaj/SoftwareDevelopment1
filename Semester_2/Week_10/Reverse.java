/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Reverse{ 
    static int reverse(int number) {
        int reverse = 0; 
        while(number != 0) {
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10; 
        }  
        return reverse; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an integer (-1 to exit): ");
            number = input.nextInt();
            if (number != -1) System.out.println(number+" reversed is "+reverse(number));
        }
        while(number != -1);
    }
}

