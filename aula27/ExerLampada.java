package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ExerLampada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lampada lamp = new Lampada();
		lamp.ligada = 0;
		lamp.checkOption = false;
		while (!lamp.checkOption) {
			System.out.print("1 - ligar | 2 - desligar: ");
			lamp.ligada = input.nextInt();
			if (lamp.ligada != 1 && lamp.ligada != 2) {
				System.out.println("Erro!");
			} else {
				lamp.checkOption = true;
			}
		}
		lamp.onOff(lamp.ligada);
	}
}
