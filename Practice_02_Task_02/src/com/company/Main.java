package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=2, b=3;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
