package com.codewithanindo;

public class Practice_set_loops {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        int i = n;
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
