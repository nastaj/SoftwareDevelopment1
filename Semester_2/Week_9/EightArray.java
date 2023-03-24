/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class EightArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String str = "";
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};

        System.out.print("Enter number: ");
        num = input.nextInt();

        for (int i = 0; i < x.length; i++) {
            if (num == x[i]) {
                str = "is found";
                break;
            }
            else {
                str = "not found";
            }
        }

        System.out.println("Number "+str);
    }
}