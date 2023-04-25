/*
Program name: S2 Week 14 Assessment
Description: Assessment 5
Date: 25/04/2023
Author: Jakub Nasta
*/

public class Exercise3{
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        double avg = 0;

        System.out.println("There are "+numbers.length+" values in the numbers array.");
        System.out.println("The values are: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            total+=numbers[i];
            avg = (double)total/numbers.length;
        }

        System.out.println();
        System.out.println();

        System.out.println("The first, fourth, seventh and tenth values in the numbers array are: ");
        System.out.println(numbers[0]+" "+numbers[3]+" "+numbers[6]+" "+numbers[9]);

        System.out.println();
        System.out.println("The sum total of all the values in the array is: "+total);

        System.out.println();
        System.out.println("The average of all the values in the array is: "+avg);
    }
}