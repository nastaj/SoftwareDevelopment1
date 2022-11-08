/*
Program name: Week 6
Description: Revision for Week 6
Date: 08/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class OneNumberInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a number: ");
        number = input.nextInt();
        
        System.out.println("Number you entered is: "+number);
}
}