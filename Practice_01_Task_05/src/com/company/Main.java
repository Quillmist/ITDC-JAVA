package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    int a,b,c,v;
        
        System.out.println("Данная программа вычисляет объем параллелепипеда.");

        System.out.print("Введите длину: ");
        a = in.nextInt();

        System.out.print("Введите ширину: ");
        b = in.nextInt();

        System.out.print("Введите высоту: ");
        c = in.nextInt();

        v = a * b * c;

        System.out.printf("Объем параллелепипеда: %d x %d x %d = %d\n",a, b, c, v);
    }
}
