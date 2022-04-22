package com.valerio.cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exer14v2 {

	static Scanner key = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double tempo;

		System.out.println("Digite o tamanho do arquivo em MBytes: ");
		double arquivoMB = key.nextDouble();
		System.out.println("Digite a velocidade da internet em Mbps: ");
		double velMbps = key.nextDouble();

		tempo = arquivoMB / velMbps;

		System.out.println(new DecimalFormat("0.00").format(tempo) + " minutos para fazer o download de " + arquivoMB
				+ " MBytes de arquivo.");

	}

}
