package com.valerio.cursojava.aula20;

public class ArraysMultidimensionais {

	public static void main(String[] args) {
		int[][] a = new int[8][4];
		/*a[0][0] = 5;
		a[0][1] = 1;
		a[0][2] = 10;
		a[0][3] = 15;
		a[0][4] = 20;*/

		for (int i = 0; i < a.length; i++) {
			for (int p = 0; p < a[i].length; p++) {
				a[i][p] = (int) Math.round(Math.random() * 9);
				System.out.print(a[i][p] + " ");
			}System.out.println();
		}
	}
}
