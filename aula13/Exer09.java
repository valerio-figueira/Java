package com.valerio.cursojava.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exer09 {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {		
		
		System.out.println("Este programa converte graus Farenheit para Celsius.\nDigite os graus Farenheit: ");
		double farenheit = key.nextDouble();
		double celsius = (farenheit - 32) * 5 / 9;
		System.out.println(farenheit + " Farenheit são: " +new DecimalFormat("0.##").format(celsius) + "ºC.");
		
	}

}
