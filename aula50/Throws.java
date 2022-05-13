package com.valerio.cursojava.aula50;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.print("Digite um número: ");
			typeDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	static double typeDouble() throws Exception {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

}
