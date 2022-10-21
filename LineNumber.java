/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 21/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class LineNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line;
        String sentence;

        System.out.println("Enter a line number: ");
        line = input.nextLine();
        System.out.println("Enter a sentence: ");
        sentence = input.nextLine();
        System.out.println(line +". "+ sentence);

}
}