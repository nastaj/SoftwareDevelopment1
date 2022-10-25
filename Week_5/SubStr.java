/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 25/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SubStr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Please enter a word: ");
        word = input.next();
        System.out.println("A substring created from the first 4 characters of \""+word+"\" is: "+word.substring(0,4));
      
}
}