package com.valerio.cursojava.aula17;
public class Exer04 {

	public static void main(String[] args) {
		double pA = 80000, pB = 200000;
		double crescA, crescB;
		int ano = 0;
		
		while (pA < pB) {
			crescA = (pA / 100) * 3;
			crescB = (pB / 100) * 1.5;
			pB = crescB + pB;
			pA = crescA + pA;
			System.out.println("População A: " + pA);
			System.out.println("População B: " + pB);
			System.out.println("Ano: " + ano);
			ano++;
		}

	}

}