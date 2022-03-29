package com.valerio.cursojava.aula19v2;
import java.text.DecimalFormat;

public class Exer04 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.##");
		int a[] = new int[10];
		double b[] = new double[a.length];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)Math.round(Math.random()*10);
			b[i] = Math.sqrt(a[i]);
			System.out.println((i+1)+"º posição do valor de A: "+a[i]);
			System.out.println((i+1)+"º posição do valor de B: "+df.format(b[i]));
		}
	}
}
