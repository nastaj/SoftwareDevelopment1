/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int age;

    System.out.print("Enter your age: ");
    age = input.nextInt();

    System.out.println("If you are "+age+" years old, you are: ");

    if (age<13) {
        System.out.println("    too young to create a Facebook acount");
    }
    if (age<16) {
        System.out.println("    too young to have a driver's license");
    }
    if (age<18) {
        System.out.println("    too young to vote");
    }
    if (age<21) {
        System.out.println("    too young to become a TD");
    }
    if (age<50) {
        System.out.println("    too young to be called old");
    }
    if (age>50) {
        System.out.println("    ...getting old!");
    }


    }
}