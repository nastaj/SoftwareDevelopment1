/*
Program name: S2 Week 10 Labs
Description: Exercises for S2 Week 10
Date: 28/03/2023
Author: Jakub Nasta
*/

import java.util.Scanner;
public class InstanceMethods{
    public void method1() {
        System.out.println("Hello from method1");
    }

    public void method2() {
        System.out.println("Hello from method2");
    }

    public void method3(int value) {
        System.out.println("You passed me, method3, an integer value of "+value);
    }

    public void method4(int a, int b) {
        System.out.println("You passed me, method4, an integer values of: "+a+" and "+b);
    }

    public void method5(int a, int b, int c) {
        System.out.println("You passed me, method5, an integer values of: "+a+", "+b+" and "+c);
    }

    public void method6(String firstName, String lastName) {
        System.out.println("You passed me, method6, the name: "+firstName+" "+lastName);
    }

    public void method7(String name, int value) {
        System.out.println("You passed me, method7, the name "+name+" and the number "+value);
    }

    public int method8(int number) {
        return number;
    }

    public String method9(String firstName, String lastName) {
        return firstName+" "+lastName;
    }

    public int method10(int a, int b, int c) {
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InstanceMethods im = new InstanceMethods();

        im.method1();
        im.method2();
        im.method3(4);
        im.method4(10, 20);
        im.method5(10, 20, 30);
        im.method6("Jakub", "Nasta");
        im.method7("Jakub", 3);
        System.out.println("method8 returned a value of "+im.method8(1000)+" to me");
        System.out.println(im.method9("Jakub", "Nasta"));
        System.out.println(im.method10(4, 6, 10));

    }
}

