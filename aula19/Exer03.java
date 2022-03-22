package com.valerio.cursojava.aula19;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		String output = "";

		for (int i = 0; i < a.length; i++) {
			System.out.print("Vetor A | Digite o " + (i + 1) + "º vetor:");
			a[i] = key.nextInt();
			b[i] = square(a[i]);
			output += "\nVetor B | "+(i+1)+"º vetor:" + b[i];
		}
		System.out.println(output);
	}

	public static int square(int num) {
		return num * num;
	}

}
