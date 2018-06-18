package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int a=2, b=3, c;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        c=a;
        a=b;
        b=c;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
