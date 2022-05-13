package com.valerio.cursojava.aula52;

public class CriandoMinhaException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[] num = { 4, 8, 16, 5, 9, 32, 21, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0, 12, 16 };

		for (int i = 0; i < num.length; i++) {
			try {
				if (num[i] % 2 != 0) {
					throw new DivisaoInexata(num[i], denom[i]);
				}
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i] / denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoInexata e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
