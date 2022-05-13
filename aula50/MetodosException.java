package com.valerio.cursojava.aula50;

public class MetodosException {

	public static void main(String[] args) {
		// MétodosDaSuperClasseThrowable

		int[] num = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i] / denom[i]));
			} catch (Exception exception) {
				System.out.println(exception.getMessage()); // mostra os detalhes da exception
				exception.printStackTrace(); // rastrear o local da exception
			} finally {
				System.out.println("Finally (Sempre executado após as exceptions)");
			}
		}
	}

}
