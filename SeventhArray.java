/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SeventhArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int [] xReverse = new int[x.length];
        int end = x.length - 1;

        for (int i = 0; i < x.length; i++) {
            xReverse[i] = x[end--];
        }

        System.out.println("Index\t\tBefore\t\tAfter");
        System.out.println("-----\t\t------\t\t-----");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i+"\t\t"+x[i]+"\t\t"+xReverse[i]);
        }
    }
}