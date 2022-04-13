package com.valerio.cursojava.aula34;

public class Calculadora {
	static private double result;

	static double somarNum(double num1, double num2) {
		return setResult(num1 + num2);
	}

	static double subtrairNum(double num1, double num2) {
		return setResult(num1 - num2);
	}

	static double dividirNum(double num1, double num2) {
		return setResult(num1 / num2);
	}

	static double elevarNum(double num, int potencia) {
		return setResult(Math.pow(num, potencia));
	}

	/*
	 * 0! = 1 
	 * 5! = 5 * 4 * 3 * 2 * 1 = 120
	 *  
	 */
	static double fatorarNum(int num) {
		int fat = num;

		if (num == 0) {
			return 1;
		}

		for (int i = 1; i < num; i++) {
			fat *= i;
		}
		return setResult(fat);
	}

	public static double getResult() {
		return result;
	}

	public static double setResult(double result) {
		Calculadora.result = result;
		return result;
	}
}