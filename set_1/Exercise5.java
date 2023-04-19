/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise5{
    static void printArray(int[] arr) {
        // Original array
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t"+arr[i]);
        }
        System.out.println();

        // Array * 3
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t"+arr[i]*3);
        }
    }

    public static void main(String[] args) {
        int [] x = {100, 200, 300, 400};
        printArray(x);
    }
}

