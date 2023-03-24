/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwoD_Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] x = {{1,2}, {3,4}};

        System.out.println("Content of array accessed using a for loop: ");
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x.length; col++) {
                System.out.println(x[row][col]);
            }
        }
    }
}