package com.valerio.cursojava.aula47;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] vetor = new int[5];

			System.out.println("Antes do erro.");

			vetor[5] = 5;			
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.err.println("Erro ao acessar uma posição inexistente do vetor.");
		}
		
		System.out.println("Depois do erro");
	}
}
