/*
Program name: Week 8
Description: Exercises for Week 8
Date: 25/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class Grades{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
        int g1, g2, g3, g4, g5, g6, g7, g8, g9, g10;
        int total;
        double average;

        System.out.print("Enter Student ID 1: ");
        s1 = input.next();
        System.out.print("Enter grade for Student 1: ");
        g1 = input.nextInt();
        System.out.print("Enter Student ID 2: ");
        s2 = input.next();
        System.out.print("Enter grade for Student 2: ");
        g2 = input.nextInt();
        System.out.print("Enter Student ID 3: ");
        s3 = input.next();
        System.out.print("Enter grade for Student 3: ");
        g3 = input.nextInt();
        System.out.print("Enter Student ID 4: ");
        s4 = input.next();
        System.out.print("Enter grade for Student 4: ");
        g4 = input.nextInt();
        System.out.print("Enter Student ID 5: ");
        s5 = input.next();
        System.out.print("Enter grade for Student 5: ");
        g5 = input.nextInt();
        System.out.print("Enter Student ID 6: ");
        s6 = input.next();
        System.out.print("Enter grade for Student 6: ");
        g6 = input.nextInt();
        System.out.print("Enter Student ID 7: ");
        s7 = input.next();
        System.out.print("Enter grade for Student 7: ");
        g7 = input.nextInt();
        System.out.print("Enter Student ID 8: ");
        s8 = input.next();
        System.out.print("Enter grade for Student 8: ");
        g8 = input.nextInt();
        System.out.print("Enter Student ID 9: ");
        s9 = input.next();
        System.out.print("Enter grade for Student 9: ");
        g9 = input.nextInt();
        System.out.print("Enter Student ID 10: ");
        s10 = input.next();
        System.out.print("Enter grade for Student 10: ");
        g10 = input.nextInt();

        total = g1+g2+g3+g4+g5+g6+g7+g8+g9+g10;
        average = total/10;

        System.out.println("------------------------");
        System.out.println("|#  |Student   |Grade  |");
        System.out.println("------------------------");
        System.out.println("|1  |"+s1+"   |"+g1+"     |");
        System.out.println("------------------------");
        System.out.println("|2  |"+s2+"   |"+g2+"     |");
        System.out.println("------------------------");
        System.out.println("|3  |"+s3+"   |"+g3+"     |");
        System.out.println("------------------------");
        System.out.println("|4  |"+s4+"   |"+g4+"     |");
        System.out.println("------------------------");
        System.out.println("|5  |"+s5+"   |"+g5+"     |");
        System.out.println("------------------------");
        System.out.println("|6  |"+s6+"   |"+g6+"     |");
        System.out.println("------------------------");
        System.out.println("|7  |"+s7+"   |"+g7+"     |");
        System.out.println("------------------------");
        System.out.println("|8  |"+s8+"   |"+g8+"     |");
        System.out.println("------------------------");
        System.out.println("|9  |"+s9+"   |"+g9+"     |");
        System.out.println("------------------------");
        System.out.println("|10 |"+s10+"   |"+g10+"     |");
        System.out.println("------------------------");
        System.out.println("|   |Total     |"+total+"    |");
        System.out.println("------------------------");
        System.out.println("|   |Average   |"+average+"   |");
        

    
    }
}