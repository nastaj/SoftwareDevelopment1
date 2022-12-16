/*
Program name: Week 11
Description: Revision for Week 11
Date: 16/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NameAge{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name;
    int age, futureAge;

    System.out.print("Enter your first name: ");
    name = input.next();
    System.out.print("Enter your age: ");
    age = input.nextInt();

    futureAge = age+20;

    System.out.println(name+" you are "+age+" years old. In 20 years time you will be "+futureAge+" years old.");

    }
}