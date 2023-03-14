/*
Program name: S2 Week 8 Assessment
Description: Assessment for S2 Week 8
Date: 14/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int rows = 1; rows <= 4; rows++) {
            for (int columns = 1; columns <= 4; columns++) {
                System.out.print("r"+rows+"c"+columns+" ");
            }
            System.out.println();
        }
    }
}