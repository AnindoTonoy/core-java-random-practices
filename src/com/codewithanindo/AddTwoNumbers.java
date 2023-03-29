package com.codewithanindo;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0;
        System.out.println("FirstNumber is: " +firstNumber+ ", SecondNumber is: " +secondNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        firstNumber = scanner.nextInt();
        System.out.print("Enter second number:");
        secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("Sum of these two number is: " + result);
    }
}
