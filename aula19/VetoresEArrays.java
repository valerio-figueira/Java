package com.valerio.cursojava.aula19;

public class VetoresEArrays {

	public static void main(String[] args) {
		double[] temp = new double[365];
		temp[0] = 31.3;
		temp[1] = 32;
		temp[2] = 33.7;
		temp[3] = 34;

		System.out.println("Temperatura do dia 3: " + temp[2]);
		System.out.println("Quantidade de vetores: " + temp.length);
		System.out.println("Valores de cada vetor: " + temp);

		for (int i = 0; i < temp.length; i++) {
			System.out.println("A temperatura do dia " + (i + 1) + " é: " + temp[i]);
		}
		for (double a : temp) {
			System.out.println(a);
		}

	}

}
