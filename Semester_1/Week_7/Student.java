/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Student{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String id;
        double grade;
        int age;

        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter student id: ");
        id = input.next();
        System.out.print("Enter average grade: ");
        grade = input.nextDouble();
        System.out.print("Enter age: ");
        age = input.nextInt();

        System.out.println("+--------------------------------------+");
        System.out.println("| "+name+" | "+id+" | "+grade+" | "+age+"  |");
        System.out.println("+--------------------------------------+");

    }
}