package com.codewithanindo;

import java.util.Scanner;

public class PracticesJava {
//    public static void announceDeveloperTeaTime(){
//        System.out.println("Waiting for developer Tea Time...");
//        System.out.println("Enter a random number to start Developer Tea Time.");
//        Scanner input = new Scanner(System.in);
//        input.next();
//        System.out.println("Enjoy the Developer Tea Time.");
//    }
    public static void calculateMealCost(double mealCost, double tipRate, double taxRate){
        double tip = tipRate * mealCost;
        double tax = taxRate * mealCost;
        double result = tip + tax + mealCost;
        System.out.println("The meal cost is: "  + mealCost);
        System.out.println("Tip: "  + tip);
        System.out.format("Tax: %.2f\n", tax);
        System.out.println("The total meal cost is: "  + result);
    }

    public static void main(String[] args) {
        //announceDeveloperTeaTime();
        calculateMealCost(15, .8, .12);

    }
}
