package com.valerio.cursojava.aula17v2;

public class Exer04v2 {

	public static void main(String[] args) {
		double pA, pB, txA, txB, anos;

		for (pA = 80000, pB = 200000, anos = 0; pA <= pB; anos++) {
			txA = (pA / 100) * 3;
			txB = (pB / 100) * 1.5;
			pA = pA + txA;
			pB = pB + txB;
			System.out.println(anos + " anos.");
		}

	}

}
