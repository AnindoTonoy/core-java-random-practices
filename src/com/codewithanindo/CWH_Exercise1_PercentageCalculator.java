package com.codewithanindo;

import java.util.Scanner;

public class CWH_Exercise1_PercentageCalculator {
    public static void main(String[] args) {
        byte totalSub = 5;
        byte fullMarks = 100;
        System.out.println("Out of Marks 100");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks of Bangla: ");
        byte bangla = scanner.nextByte();
        System.out.print("Enter marks of English: ");
        byte english = scanner.nextByte();
        System.out.print("Enter marks of Mathematics: ");
        byte mathematics = scanner.nextByte();
        System.out.print("Enter marks of Social science: ");
        byte socialScience = scanner.nextByte();
        System.out.print("Enter marks of Physics: ");
        byte physics = scanner.nextByte();

        float allMarks = bangla + english + mathematics + socialScience + physics;
        float totalPercentage = (allMarks/(5*100)) * 100;
        System.out.println("The Percentage of your all Marks: " +totalPercentage);

    }



}
