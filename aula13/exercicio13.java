package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		double IR;
		double INSS;
		double Sindicato;
		double liquido;
		double totalDescontos;
		
		System.out.println("Quanto você ganha por hora: ");
		double qtdHoras = key.nextDouble();
		System.out.println("A quantidade de horas trabalhadas no mês: ");
		int horasMes = key.nextInt();
		double salarioBruto = qtdHoras * horasMes;
		
		IR = (salarioBruto/100)*11;
		INSS = (salarioBruto/100)*8;
		Sindicato = (salarioBruto/100)*5;
		liquido = salarioBruto - INSS - Sindicato;
		totalDescontos = INSS + Sindicato + IR;
		
		System.out.println("INSS: R$"+INSS);
		System.out.println("Sindicato: R$"+Sindicato);
		System.out.println("IR: R$"+IR);
		System.out.println("Total descontos: R$"+totalDescontos);
		System.out.println("Salário bruto: R$"+salarioBruto);
		System.out.println("Salário líquido: R$"+liquido);

		
	}

}
