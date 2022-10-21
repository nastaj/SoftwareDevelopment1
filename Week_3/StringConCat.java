/*
Program name: StringConCat
Description: String Concatenation using variables
Date: 11/10/2022
Author: Jakub Nasta
*/

public class StringConCat{
    public static void main(String[] args) {
        int age = 20; //number value of 20 assigned to a variable named age

        //Value assigned to age is retrieved from memory and appended to the string "Age: ".
        System.out.println("Age: " + age);

        //Value assigned to age is retrieved from memory and appended to the string " years old.".
        System.out.println(age + " years old.");

        /* Value assigned to age is retrieved from memory and appended to the string "Age is ".
        This produces a new string "Age is 20". Then the string " years old." is appended
        to this new string "Age is 20" to give "Age is 20 years old.". */
        System.out.println("Age is " + age + " years old.");
    }
}