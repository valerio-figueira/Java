package com.valerio.cursojava.aula35;

public class SomaNum {

	static void getNum(int num) {
		System.out.println(num);
	}

	static int somaNum(int num) {
		
		if (num == 1) {
			return 1;
		}

		return num + somaNum(num - 1);
	}
}