/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 21/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class ThirdArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] x = {1, 2, 3, 4, 5};

        System.out.println("Index    Value");
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.println(i+"        "+x[i]);
        }
    }
}