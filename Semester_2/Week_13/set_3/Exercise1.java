/*
Program name: S2 Week 23 Labs
Description: Sample Assessments for Week 23
Date: 18/04/2023
Author: Jakub Nasta
*/

public class Exercise1{
    static void printDesc(String name, String college, int courseLength, String course, double avgGrade) {
        System.out.println(name+" is a student in "+college+".\nShe is doing a "+courseLength+" year course in "+course+".\nHer average grade so far is "+avgGrade+"%.");
}
    public static void main(String[] args) {
        printDesc("Jane", "ATU", 3, "Mechanical Engineering", 67.4);
    }
}

