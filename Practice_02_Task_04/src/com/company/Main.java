package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double CM_IN_INCHES = 2.54; // константа
        double result;
        System.out.print("Введите значение в дюймах: ");
        result = in.nextDouble();

        result = result * CM_IN_INCHES;

        System.out.println("В дюймах: " + result);
    }
}
