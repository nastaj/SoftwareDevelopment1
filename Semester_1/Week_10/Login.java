/*
Program name: Week 10
Description: Exercises for Week 10
Date: 06/12/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Login{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String user;
    int id;

    System.out.print("Enter ID: ");
    id = input.nextInt();
    System.out.print("Enter username: ");
    user = input.next();

    if ((id==1000 && user.equals("user1")) || (id==2000 && user.equals("user2"))) {
        System.out.println("Login success!");
    }
    else {
        System.out.println("Wrong ID or username. Access is denied.");
    }

    }
}