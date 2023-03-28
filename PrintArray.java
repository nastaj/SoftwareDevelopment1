/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class PrintArray{
    static void outputArray(int[] arr) {
        System.out.println("Index\tValue\tSquare");
        System.out.println("=====\t=====\t======");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t"+arr[i]+"\t"+(int)Math.pow(arr[i], 2));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        outputArray(array);
    }
}

