/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise4{
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            for(int j = 2-i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 3-i; k <= 3 ; k++) {
                System.out.print(k*3 + " ");
            }
            System.out.println();
        }
    }
}
