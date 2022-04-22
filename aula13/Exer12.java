package com.valerio.cursojava.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exer12 {
	static Scanner key = new Scanner (System.in);
	
	public static void main(String[] args) {		
		
		System.out.println("Digite sua altura para que descubra seu peso ideal: ");
		float altura = key.nextFloat();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é "+new DecimalFormat("0.##").format(pesoIdeal)+"kg.");

	}

}
