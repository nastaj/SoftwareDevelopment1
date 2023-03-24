/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class ShoppingList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item;
        int numberItems;
        String x [];

        System.out.print("How many items do you need to add to your shopping list: ");
        numberItems = input.nextInt();

        x = new String [numberItems];
        
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print("Add item "+(i+1)+" to shopping list: ");
            item = input.next();
            x[i] = item;
        }

        System.out.println();
        System.out.println("Shopping List: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println((i+1)+". "+x[i]);
        }
    }
}