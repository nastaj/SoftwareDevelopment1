/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SixthArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        boolean found = true;
        int [] arr = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};

        System.out.print("Enter search number: ");
        x = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Number is contained in the array at index "+i);
                found = true;
                break;
            }
            else {
                found = false;
            }
        }

        if (found == false) {
            System.out.println("Number not found.");
        }
    }
}