package com.valerio.cursojava.aula19;

import java.util.Scanner;

public class maiorEmenor {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] idade = new int[5];

		for (int i = 0; i < idade.length; i++) {
			idade[i] = (int) Math.round(Math.random() * 10);
			System.out.println(idade[i]);
		}
		System.out.println("A maior idade é: "+idMaior(idade));
		System.out.println("A menor idade é: "+idMenor(idade));

	}public static int idMaior(int[] a) {
		int maior = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maior) {
				maior = a[i];
			}
		}return maior;
	}public static int idMenor(int[] a) {
		int menor = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] < menor) {
				menor = a[i];
			}
		}return menor;
	}

}
