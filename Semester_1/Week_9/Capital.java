/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Capital{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num;

    System.out.println("What is the capital city of Ireland:");
    System.out.println("");
    System.out.println("1. Madrid");
    System.out.println("2. Paris");
    System.out.println("3. Dublin");
    System.out.println("4. Berlin");
    System.out.println("");
    System.out.print("Enter number for your answer: ");
    num = input.nextInt();

    if (num==3) {
        System.out.println("");
        System.out.println("Correct");
    }

    else if (num==1 || num==2 || num==4) {
        System.out.println("");
        System.out.println("Incorrect");
    }

    else {
        System.out.println("");
        System.out.println("Invalid answer, must be: 1, 2, 3 or 4");
    }

}
}