package com.codewithanindo;

import java.util.Scanner;

public class Main {
    public int dividedNumber(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

       // System.out.println("Hello world!");
//        Triangle triangleA = new Triangle(8,12, 14,14.44, 16.33);
//        Triangle triangleB = new Triangle(5,7,3,3,3);
//
//        double triangleAArea = triangleA.findArea();
//        System.out.println("TriangleA Area is: " +triangleAArea);
//
//        double triangleBArea = triangleB.findArea();
//        System.out.println("TriangleB Area is: " +triangleBArea);
//
//        System.out.println("Triangle static variable is: " + Triangle.numOfSize);


        Student studentA = new Student("Anindo", "Dey", 2019, 2.69, "CSE");
        Student studentB = new Student("Arpon", "Dey", 2025, 3.80, "CIVIL");

        System.out.println(studentA.firstName + " " + studentA.lastName);
        studentA.incrementExpectedGraduationYear();
        System.out.println("Expected graduation year: " + studentA.expectedGraduationYear);

        System.out.println(studentB.firstName + " " + studentB.lastName);
        studentB.incrementExpectedGraduationYear();
        System.out.println("Expected graduation year: " + studentB.expectedGraduationYear);

//        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        Main myMain = new Main();
//        System.out.println("Divided of " + number1 + " by " + number2 + " is: "
//                + myMain.dividedNumber(number1, number2));
    }
}
