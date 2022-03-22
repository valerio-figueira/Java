package com.valerio.cursojava.aula17;
public class Exer18v2 {

	public static void main(String[] args) {

		int num, i;
		boolean primo = true; // flag de verificação
		num = (int)Math.round(Math.random()*20);
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo!");
				primo = false;
			}
		}
		if (num > 1 && primo) {
			System.out.println(num+"Número é primo!");
		} else {
			System.out.println("Não é primo!");
		}
	}
}