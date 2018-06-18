package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double degreeOfPharengeyt,degreeOfCelsium;

        System.out.print("Введите значение в Фаренгейтах: ");

        degreeOfPharengeyt = in.nextDouble();
        degreeOfCelsium = (degreeOfPharengeyt - 32) * 5 / 9;

        System.out.printf("В градусах Цельсия: %.2f\n", degreeOfCelsium); // %2.f - два знака после запятой
    }
}
