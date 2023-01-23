/*
Program name: Lab 4
Description: Exercises for Week 4
Date: 23/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class League{
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        String firstPlace;
        int firstScore;
        String secondPlace;
        int secondScore;
        String thirdPlace;
        int thirdScore;
        String fourthPlace;
        int fourthScore;

        System.out.println("Enter team in first place: ");
        firstPlace = input.next();
        System.out.println("Enter points: ");
        firstScore = input.nextInt();
        System.out.println("Enter team in second place: ");
        secondPlace = input.next();
        System.out.println("Enter points: ");
        secondScore = input.nextInt();
        System.out.println("Enter team in third place: ");
        thirdPlace = input.next();
        System.out.println("Enter points: ");
        thirdScore = input.nextInt();
        System.out.println("Enter team in fourth place: ");
        fourthPlace = input.next();
        System.out.println("Enter points: ");
        fourthScore = input.nextInt();

        System.out.println("-------------------------");
        System.out.println("|# |Team        |Points |");
        System.out.println("-------------------------");
        System.out.println("|1 |"+firstPlace+"     |"+firstScore+"   |");
        System.out.println("-------------------------");
        System.out.println("|2 |"+secondPlace+"     |"+secondScore+"      |");
        System.out.println("-------------------------");
        System.out.println("|3 |"+thirdPlace+"     |"+thirdScore+"       |");
        System.out.println("-------------------------");
        System.out.println("|4 |"+fourthPlace+"     |"+fourthScore+"        |");
        System.out.println("-------------------------");


    }
}