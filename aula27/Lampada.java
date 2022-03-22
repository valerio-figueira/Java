package com.valerio.cursojava.aula27;

public class Lampada {
	boolean onOff(int num) {
		if (num == 1) {
			System.out.println("Ligado");
			return true;
		} else {
			System.out.println("Desligado");
			return false;
		}
	}
}