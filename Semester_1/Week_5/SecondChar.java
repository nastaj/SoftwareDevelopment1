/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 25/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SecondChar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Please enter a word: ");
        word = input.next();
        System.out.println("The first character in the word "+word+" is: "+word.charAt(1));
      
}
}