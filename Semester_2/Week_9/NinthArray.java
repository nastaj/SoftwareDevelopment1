/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NinthArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isFirstEqual = true;
        boolean isSecondEqual = true;
        int [] first = {1, 2, 3, 4};
        int [] second = {1, 2, 3, 4};
        int [] third = {1, 2, 64, 4};

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                isFirstEqual = false;
                break;
            }
            else {
                isFirstEqual = true;
            }

            if (first[i] != third[i]) {
                isSecondEqual = false;
                break;
            }
            else {
                isSecondEqual = true;
            }
        }

        if (isFirstEqual) {
            System.out.println("Array first is equal to array second.");  
        } 
        else {
            System.out.println("Array first is not equal to array second.");
        }

        if (isSecondEqual) {
            System.out.println("Array first is equal to array third.");  
        } 
        else {
            System.out.println("Array first is not equal to array third.");
        }

    }
    
}
