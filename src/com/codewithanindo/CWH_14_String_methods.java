package com.codewithanindo;

import java.util.Locale;

public class CWH_14_String_methods {
    public static void main(String[] args) {
        String name = "Anindo Dey";
        System.out.println("Name is: " +name);
        int value = name.length();
        System.out.println("The length of the String: " +value);

        String lString = name.toLowerCase();
        System.out.println("Lower case name: "+lString);
        System.out.println("Upper case name: "+lString.toUpperCase());

        String nonTrimmedString = "    Anindo    ";
        System.out.println("Non Trimmed Sting: " +nonTrimmedString);
        System.out.println("Trimmed Sting: " +nonTrimmedString.trim());
        System.out.println("Substring: " +name.substring(7, 10));

        System.out.println("Replace name: " +name.replace("Anindo", "Tonoy"));

//        System.out.println(name.charAt(1));
//        System.out.println(name.indexOf("n", 2));
//        System.out.println(name.lastIndexOf("do"));
//        System.out.println(name.equals("Anindo Dey"));
        System.out.println(name.equalsIgnoreCase("anIndo DEy"));
    }

}
