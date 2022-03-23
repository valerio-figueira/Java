package com.valerio.cursojava.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exer12 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		System.out.println("Digite sua altura para que descubra seu peso ideal: ");
		float altura = key.nextFloat();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é "+new DecimalFormat("0.##").format(pesoIdeal)+"kg.");

	}

}
