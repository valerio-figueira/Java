package com.valerio.cursojava.aula18;

import java.util.Scanner;

public class Labels {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("Rótulo 3.");
					} System.out.println("Rótulo 2."); 
				} System.out.println("Rótulo 1."); 
			} System.out.println(i);
		}
	}
}
