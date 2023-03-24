/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Names{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String [3];

        System.out.print("Enter first name: ");
        names[0] = input.nextLine();
        System.out.print("Enter second name: ");
        names[1] = input.nextLine();
        System.out.print("Enter third name: ");
        names[2] = input.nextLine();

        System.out.println();
        System.out.println("Names");
        System.out.println("-----");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}