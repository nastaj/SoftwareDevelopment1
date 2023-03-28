/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Average{
    static double avg(int a, int b, int c) {
        return (a+b+c)/(double)3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Average of the three numbers is: "+avg(numbers[0], numbers[1], numbers[2]));
    }
}

