/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise5{
    static void calcArray(int[] arr) {
        int total = 0, totalModified = 0;

        // Print the original array & total
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t"+arr[i]);

            // Calculate total
            total += arr[i];
        }
        System.out.println("-----------");
        System.out.println("Total: "+total);

        // Print modified array & total
        System.out.println();
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i = 0; i < arr.length; i++) {
            // Update even values in the array by 100
            if (arr[i] % 2 == 0) {
            arr[i] += 100;
            }
            System.out.println(i+"\t"+arr[i]);

            // Calculate total
            totalModified += arr[i];
        }
        System.out.println("-----------");
        System.out.println("Total: "+totalModified);
    }

    public static void main(String[] args) {
        int [] x = {1, 2, 3, 4, 5, 6};
        calcArray(x);
    }
}