/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class FourthArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] x = {7, 6, 11, 15, 19};
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        System.out.println("Sum of array values is: "+sum);
    }
}