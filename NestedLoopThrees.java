/*
Program name: S2 Week 7 Lab
Description: Exercises for Semester 2 Week 7 Lab
Date: 07/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class NestedLoopThrees{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String myString = "";
      int count = 1, howMany = 1;
      
      do {
        for (int rows = 1; rows <= howMany; rows++) {
          for (int cols = 1; cols <= 5; cols++) {
              myString+="3, ";
            }
            myString+="\n";
          }
          System.out.print("Have "+howMany+" rows, need another? Enter 0 for no: ");
          count = input.nextInt();
          if (count != 0) {
            howMany++;
          }
      }
      while (count != 0);
      System.out.println(myString);
    }
}