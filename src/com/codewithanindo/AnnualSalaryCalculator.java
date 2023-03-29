package com.codewithanindo;

import java.util.Scanner;

public class AnnualSalaryCalculator {
    public static double salaryCalculator(double hoursPerWeek, double amountPerHours, int vacationDays){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (amountPerHours < 0){
            return -1;
        }
        double weeklyPayCheck = hoursPerWeek * amountPerHours;
        double unpaidTime = vacationDays * amountPerHours * 8;
        return (weeklyPayCheck * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the work hours per week: ");
        double hoursPerWeek = scanner.nextDouble();

        System.out.println("Enter the amount($) per hours: ");
        double amountPerHours = scanner.nextDouble();

        System.out.println("Enter the vacation days: ");
        int vacationDays = scanner.nextInt();

        double salary = salaryCalculator(hoursPerWeek, amountPerHours, vacationDays);
        System.out.println("The annual Salary is: $" + salary);
    }
}
