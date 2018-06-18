package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextShort();
        System.out.print("b: ");
        int b = in.nextShort();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);
    }
}