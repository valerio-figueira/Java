package com.valerio.cursojava.aula35;

public class ExerFatorial {

	static void showNum(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		showNum(RecursividadeFatorial.fatorial(5, 1));
	}
}