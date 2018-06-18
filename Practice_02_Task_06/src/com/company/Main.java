package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = 0, max = 0, result;

		System.out.print("Введите минимальное число: ");
		min = in.nextInt();

		System.out.print("Введите максимальное число: ");
		max = in.nextInt();

		result = (int) (min + Math.random() * (max - min + 1));
		System.out.println("Случайное число: " + result);
	}

}