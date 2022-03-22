package com.valerio.cursojava.aula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int cont = 1, num, tab;

		System.out.println("Digite o número de qual deseja ver a tabuada: ");
		num = key.nextInt();
		System.out.println("Tabuada de "+num+":");
		
		while (cont <= 10) {
			tab = num * cont;
			System.out.println(num+" x "+cont+" = "+tab);
			cont++;
		}

	}

}
