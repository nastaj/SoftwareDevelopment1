/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FifthArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0;
        int [] x = new int[8];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter value for element "+(i+1)+": ");
            x[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Index    Value");
        System.out.println("-----    -----");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i+"        "+x[i]);
            total += x[i];
        }

        System.out.println();
        System.out.println("Average of array values is: "+total/x.length);
    }
}