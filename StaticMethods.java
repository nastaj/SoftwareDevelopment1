/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class StaticMethods{
    static void method1() {
        System.out.println("Hello from method1");
    }

    static void method2() {
        System.out.println("Hello from method2");
    }

    static void method3(int value) {
        System.out.println("You passed me, method3, an integer value of "+value);
    }

    static void method4(int a, int b) {
        System.out.println("You passed me, method4, an integer values of: "+a+" and "+b);
    }

    static void method5(int a, int b, int c) {
        System.out.println("You passed me, method5, an integer values of: "+a+", "+b+" and "+c);
    }

    static void method6(String firstName, String lastName) {
        System.out.println("You passed me, method6, the name: "+firstName+" "+lastName);
    }

    static void method7(String name, int value) {
        System.out.println("You passed me, method7, the name "+name+" and the number "+value);
    }

    static int method8(int number) {
        return number;
    }

    static String method9(String firstName, String lastName) {
        return firstName+" "+lastName;
    }

    static int method10(int a, int b, int c) {
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        method1();
        method2();
        method3(4);
        method4(10, 20);
        method5(10, 20, 30);
        method6("Jakub", "Nasta");
        method7("Jakub", 3);
        System.out.println("method8 returned a value of "+method8(1000)+" to me");
        System.out.println(method9("Jakub", "Nasta"));
        System.out.println(method10(4, 6, 10));

    }
}

