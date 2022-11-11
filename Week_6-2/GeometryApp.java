 /*
Program name: Week 6
Description: Revision for Week 6
Date: 11/11/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class GeometryApp{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Geometry App!");

        System.out.println("*********     ***            *           ***************");
        System.out.println("*       *   *     *         * *          *             *");
        System.out.println("*       *  *       *       *   *         *             *");
        System.out.println("*       *  *       *      *     *        *             *");
        System.out.println("*       *  *       *     *       *       *             *");
        System.out.println("*       *  *       *    *         *      *             *");
        System.out.println("*       *  *       *   *           *     *             *");
        System.out.println("*       *   *     *   *             *    *             *");
        System.out.println("*********     ***    *****************   ***************");

        System.out.println("Use this app to calculate the area of:");
        System.out.println("Rectangles, Circles, Triangles and Squares.");
        System.out.println("");

        System.out.println("Enter the length of the rectangle: ");
        rectL = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        rectW = input.nextInt();
        System.out.println("");
        System.out.println("Area of rectangle is: "+rectArea);
        System.out.println("");


    
    }
}