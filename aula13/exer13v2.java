package com.valerio.cursojava.aula13;
import java.util.Scanner;
public class exer13v2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		double qtdHoras = key.nextDouble();
		System.out.println("A quantidade de horas trabalhadas no mês: ");
		int horasMes = key.nextInt();
		
		double salarioBruto = qtdHoras * horasMes;
		double impostoDeRenda = 11*salarioBruto/100;
		
		double ImpostoDeRenda = 11/100;
		
		//ImpostoDeRenda = salarioBruto
		
		double INSS = 8*salarioBruto/100;
		double sindicato = 5*salarioBruto/100;
		double salarioLiquido = salarioBruto - impostoDeRenda - INSS - sindicato;
		
		System.out.println("Seu salário bruto é de R$"+salarioBruto);
		System.out.println("a) Pagou R$"+INSS+" de INSS.");
		System.out.println("b) Pagou R$"+sindicato+" ao sindicato.");
		System.out.println("c) Seu salário líquido é R$"+salarioLiquido);
		System.out.println("d) ");
		
	}

}