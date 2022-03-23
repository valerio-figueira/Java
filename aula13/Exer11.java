package com.valerio.cursojava.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exer11 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("a) O produto do dobro do primeiro com metade do segundo.\nDigite dois números Inteiros: ");
		int numInt1 = key.nextInt();
		int numInt2 = key.nextInt();
		int resultado1 = (numInt2/2) * (numInt1 * 2);
		System.out.println("Resultado: " +resultado1);
		System.out.println("\nb) A soma do triplo do primeiro com o terceiro.\nDigite um número Real: ");
		double numReal = key.nextDouble();
		double somaTriplo = (numInt1 * 3) + numReal;
		System.out.println("Resultado: "+somaTriplo);
		double numRealCubo = Math.pow(numReal, 3);
		System.out.println("\nc) O número Real ao cubo: "+new DecimalFormat("0.##").format(numRealCubo));
	}

}
