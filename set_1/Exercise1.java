/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise1{
    static void printDesc(String name, String job, int age, double pay) {
        System.out.println(name+" works as a "+job+".\nHe is "+age+" years old.\nHe earns "+pay+" after tax.");
}
    public static void main(String[] args) {
        printDesc("Jim", "carpenter", 47, 878.23);
    }
}