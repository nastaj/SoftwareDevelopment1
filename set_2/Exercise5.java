/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise5{
    static void calcArray(int[] arr) {
        int total = 0, product = 1;
        double avg = 0;

        // Print the original array
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t"+arr[i]);

            // Calculate total, product and average
            total += arr[i];
            product = arr[i] * product;
            avg = total / arr.length;
        }

        // Print total, product and average
        System.out.println();
        System.out.println("Total: "+total);
        System.out.println("Product: "+product);
        System.out.println("Average: "+avg);
    }

    public static void main(String[] args) {
        int [] x = {20, 30, 40, 50};
        calcArray(x);
    }
}

