package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, digit1, digit2, digit3, digit4, sum=0;
        System.out.print("Введите ваше четырехзначное число: ");
        number = in.nextInt();

        digit1 = number / 1000;
        digit2 = (number % 1000) / 100;
        digit3 = ((number % 1000) % 100) / 10;
        digit4 = number % 10;

        sum = digit1 + digit2 + digit3 + digit4;

        System.out.print("Сумма чисел равна: " + sum);
    }
}
