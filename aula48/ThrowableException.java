package com.valerio.cursojava.aula48;

public class ThrowableException {

	public static void main(String[] args) {
		int[] num = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i] / denom[i]));
			} catch (ArithmeticException Exception) {
				System.err.println("Não foi possível efetuar a divisão");
			} catch (Throwable Exception) { // Exception genérica (quando não se sabe a origem ou o porquê do erro)
				System.err.println("Houve um problema na execução");
			}
		}
	}
}
