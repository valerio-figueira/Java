package com.valerio.cursojava.aula35;

public class Fibonacci {

	static int fibonacci(int num) {

		if (num < 2) {
			return 1;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}