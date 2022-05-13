package com.valerio.cursojava.aula49;

public class TestFinally {

	public static void main(String[] args) {
		int[] num = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i] / denom[i]));
			} catch (ArithmeticException exception) {
				System.err.println("Não foi possível efetuar a divisão");
			} catch (ArrayIndexOutOfBoundsException exception) {
				exception.getMessage();
				System.err.println("Index 5 out of bounds for length 5.");
			} finally {
				System.out.println("Finally (Sempre executado após as exceptions)");
			}
			/*
			 * O finally é sempre executado 
			 */
		}
	}
}
