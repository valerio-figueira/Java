package com.valerio.cursojava.aula48;

public class MultipleCatch {

	public static void main(String[] args) {
		int[] num = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i] / denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException Exception) {
				System.err.println("Houve um problema na execução.");
			}
		}
	}

}
