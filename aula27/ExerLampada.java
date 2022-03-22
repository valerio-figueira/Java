package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ExerLampada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lampada lamp = new Lampada();
		int num = 0;
		boolean sair = false;
		while (!sair) {
			System.out.print("1 - ligar | 2 - desligar: ");
			num = input.nextInt();
			if (num != 1 && num != 2) {
				System.out.println("Erro!");
			} else {
				sair = true;
			}
		}
		lamp.onOff(num);
	}
}
