/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class CreateArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type, numberValues;

        System.out.println("int or double array?");
        System.out.print("Enter 1 for int array, 2 for double array: ");
        type = input.nextInt();
        System.out.print("How many values do you need to store in the array: ");
        numberValues = input.nextInt();
        
        if (type == 1) {
            int array[] = new int [numberValues];

            System.out.println("Enter values:");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter value "+(i+1)+": ");
                array[i] = input.nextInt();
            }
            
            System.out.println();
            System.out.println("Values in array are: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[array.length - 1]) {
                    System.out.print(array[i]+", ");
                 }
                else {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
        else {
            double array[] = new double [numberValues];

            System.out.println("Enter values:");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter value "+(i+1)+": ");
                array[i] = input.nextDouble();
            }

            System.out.println();
            System.out.println("Values in array are: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[array.length - 1]) {
                    System.out.print(array[i]+", ");
                 }
                else {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
    }
}