/*
Program name: S2 Week 9 Labs
Description: Exercises for S2 Week 9
Date: 24/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class SearchStudent{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 0;
        String search;

        String [][] students = {
            {"Mary Reilly", "Software Development", "Year 1", "ATU"},
            {"Garrett Winters", "Business Studies", "Year 3", "TUS"},
            {"Ashley Cox", "Chemistry", "Year 3", "UCC"},
            {"Joe Kelly", "Computing and Digital Media", "Year 2", "ATU"}
        };

        System.out.print("Please enter a search value: ");
        search = input.nextLine();
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[row].length; col++) {
                if (students[row][col].equals(search)) {
                    matches+=1;
                    if (matches == 1) {
                        System.out.println("Name\t\tCollege");
                        System.out.println(students[row][0]+"\t"+students[row][students.length - 1]);
                    }
                    else {
                        System.out.println(students[row][0]+"\t"+students[row][col]);
                    }
                }
            }
        }
        System.out.println("Records with match: "+matches);
    }
}