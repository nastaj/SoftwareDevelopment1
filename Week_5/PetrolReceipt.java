/*
Program name: Lab 5
Description: Exercises for Week 5
Date: 28/10/2022
Author: Jakub Nasta
*/

import java.util.Scanner;
public class PetrolReceipt{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        double litres;
        double price;
        String time;
        String date;
        double total;
        double totalRound;

        System.out.println("Enter garage name: ");
        name = input.nextLine();
        System.out.println("Enter number of litres: ");
        litres = input.nextDouble();
        System.out.println("Enter price/litre: ");
        price = input.nextDouble();
        System.out.println("Enter time (hh:mi): ");
        time = input.next();
        System.out.println("Enter date(dd-mon-yyyy): ");
        date = input.next();

        total = litres*price;
        totalRound = Math.round(total * 100.0) / 100.0;

        System.out.println("+------------------------+");
        System.out.println("|   "+name+"    |");
        System.out.println("|                        |");
        System.out.println("| "+date+"    "+time+"   |");
        System.out.println("|                        |");
        System.out.println("| Litres:      "+litres+"      |");
        System.out.println("| Price/litre: "+price+"      |");
        System.out.println("|                        |");
        System.out.println("| Fuel total:  "+totalRound+"     |");
        System.out.println("|                        |");
        System.out.println("+------------------------+")  ;
      
}
}