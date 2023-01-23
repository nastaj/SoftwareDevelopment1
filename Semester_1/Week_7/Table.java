/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Table{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fname, sname, fnametwo, snametwo;
        int age, agetwo;

        System.out.print("Enter First Name: ");
        fname = input.next();
        System.out.print("Enter Surname: ");
        sname = input.next();
        System.out.print("Enter Age: ");
        age = input.nextInt();
        System.out.print("Enter First Name: ");
        fnametwo = input.next();
        System.out.print("Enter Surname: ");
        snametwo = input.next();
        System.out.print("Enter Age: ");
        agetwo = input.nextInt();

        System.out.printf("+================+================+======+%n+ First Name     + Surname        + Age  +%n+================+================+======+ %n+ %s          + %s          + %d   + %n+----------------+----------------+------+ %n+ %s          + %s          + %d   + %n+----------------+----------------+------+", fname, sname, age, fnametwo, snametwo, agetwo);

    }
}