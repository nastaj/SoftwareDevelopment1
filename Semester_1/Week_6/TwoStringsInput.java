/*
Program name: Week 6
Description: Revision for Week 6
Date: 08/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class TwoStringsInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String surname;

        System.out.println("Enter first name: ");
        name = input.next();
        System.out.println("Enter surname: ");
        surname = input.next();

        System.out.println("Name entered is: "+name+" "+surname+".");
}
}