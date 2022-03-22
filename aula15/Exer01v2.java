package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer01v2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = key.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = key.nextInt();
		
		if (num1 > num2) {System.out.println("O maior deles é "+num1);
		
		} else System.out.println("O maior deles é "+num2);
		
		
		
		
	}

}