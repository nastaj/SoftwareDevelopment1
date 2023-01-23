/*
Program name: Week 9
Description: Exercises for Week 9
Date: 02/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Access{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name;

    System.out.print("Enter a username: ");
    name = input.next();

    switch(name) {
        case "Grace":
            System.out.println("Welcome Grace - Admin level access granted");
            break;
        case "Larry":
            System.out.println("Welcome Larry - User level access granted");
            break;
        default:
            System.out.println("Access is denied!");
        }
    }
}