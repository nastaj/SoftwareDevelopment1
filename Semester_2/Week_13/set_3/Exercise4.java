/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise4{
    public static void main(String[] args) {
        int number = 10;
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                System.out.print(number+" ");
                number+=2;
            }
            System.out.println();
        }
    }
}

