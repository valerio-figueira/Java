package com.valerio.cursojava.aula35;

public class RecursividadeFatorial {

	static void getFatorial(int num) {
		System.out.println(num);
	}
	
	static int fatorial(int num, int initial) {
		if (num == 0) {
			return initial;
		}
		getFatorial(num);
		return initial * fatorial(num - 1, initial);
	}
}
