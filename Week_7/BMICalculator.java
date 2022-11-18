/*
Program name: Week 7
Description: Exercises for Week 7
Date: 18/11/2022
Author: Jakub Nasta
*/
import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weight, height;
        double bmi;


        System.out.println("Welcome to the body mass index (BMI) calculator");
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextInt();
        System.out.print("Enter your height in inches: ");
        height = input.nextInt();

        bmi = (weight/(Math.pow(height, 2)))*703;
        System.out.println("Your BMI is: "+Math.round(bmi*100.0)/100.0);
        
        System.out.println(" ");
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    
    }
}