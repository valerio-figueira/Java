package com.valerio.cursojava.aula13;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		double MBtoMbps;
		double seconds;
		double minutes;
		
		//Para descobrir o tempo de download de um arquivo em MB, com uma velocidade de Mbps, utilize: download time = file size / internet speed
		//Converter MBytes para Mbits
		System.out.println("Descobrir o tempo de download em minutos a partir do tamanho do \narquivo em MBytes e da velocidade de download em Mbps.");
		System.out.println("\nDigite o tamanho do arquivo em MBytes: ");
		double arquivoMB = key.nextDouble();
		System.out.println("Digite a velocidade da internet em Mbps: ");
		double velMbps = key.nextDouble();
		
		MBtoMbps = arquivoMB * 8;
		seconds = MBtoMbps / velMbps;
		minutes = seconds / 60;
		
		System.out.println(new DecimalFormat("0.00").format(minutes)+" minutos para fazer o download de "+arquivoMB+" MBytes de arquivo.");
		
		
		/*Let us consider the example above for our sample computation. 
		 * To calculate how long to download the 400 MB video over 
		 * a 5 Mbps internet download speed, we can use the equation below:

			download time = file size / internet download speed

			But first, let us convert the units of the file size in terms of megabits, 
			which is equivalent to 1 million bits. To do so, we'll be using the conversion 
			table above under the SI system. With that said, we now have this computation:

			400MB in bits = 400MB * (8 bits / 1 byte) * (1,000 bytes / 1 kilobyte) * (1,000 kilobytes / 1 megabyte)

			400MB in bits = 3,200,000,000 bits

			400MB in megabits = 3,200 megabits (Mb) */
		
		
	}

}
