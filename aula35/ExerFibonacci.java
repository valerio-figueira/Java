package com.valerio.cursojava.aula35;

public class ExerFibonacci {

	static void showFibonacci(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			showFibonacci(Fibonacci.fibonacci(i));
		}

	}
}
