package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class Exer07 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Este programa calcula a área de um quadrado e o dobro da área.\n Digite o lado do quadrado: ");
		double aresta = key.nextInt();
		double area = Math.pow(aresta, 2);
		//int dobro = area * 2;
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro desta área é: " + (area * 2));
	}

}
