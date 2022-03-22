package com.valerio.cursojava.aula19v2;

import java.util.Scanner;

public class Exer03 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int a[] = new int[10];
			int b[] = new int[a.length];
			
			for(int i = 0; i < a.length; i++) {
				a[i] = (int)Math.round(Math.random()*10);
				b[i] = a[i] * a[i];
				System.out.println((i+1)+"º posição do valor de A: "+a[i]);
				System.out.println((i+1)+"º posição do valor de B: "+b[i]);
			}
		}
	}
