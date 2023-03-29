package com.codewithanindo;

public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Anindo Dey";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed String is: " + reversedStr);
    }
}
