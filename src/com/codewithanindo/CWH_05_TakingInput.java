package com.codewithanindo;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
//        System.out.println("Taking Input from user: ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number 1: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter Number 2: ");
//        int num2 = scanner.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The Sum of these numbers is:");
//        System.out.println(sum);
//        boolean b1 = scanner.hasNextInt();
//        System.out.println(b1);
       // String str = scanner.nextLine();
        //System.out.println(str);
//        long b = 10;
//        do {
//            System.out.println(b);
//
//            b+=1000;
//        } while (true);

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber > 0){
            for (int i = inputNumber; i != 0; i-- ){
                System.out.println(i);
            }
        }


    }
}
