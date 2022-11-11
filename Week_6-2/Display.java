/*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class Display{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 2;
        int y = 3;

        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x)); 

}
}