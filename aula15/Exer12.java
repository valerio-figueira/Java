package com.valerio.cursojava.aula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		double valorHora, totalHora, salarioBruto, salarioLiquido, inss, fgts, sindicato, ir;

		System.out.println("Digite o valor em reais da sua hora de trabalho: ");
		valorHora = key.nextDouble();
		System.out.println("Digite o total de horas mensais: ");
		totalHora = key.nextDouble();
		salarioBruto = valorHora * totalHora;
		inss = (salarioBruto * 10) / 100;
		fgts = (salarioBruto * 11) / 100;
		sindicato = (salarioBruto * 3) / 100;

		if (salarioBruto < 900.00) {
			salarioLiquido = salarioBruto - inss;
			System.out.println("Salário Bruto R$" + salarioBruto);
			System.out.println("IR: isento.");
			System.out.println("INSS: R$" + inss);
			System.out.println("FGTS: R$" + fgts);
			System.out.println("Total de descontos: R$" + (inss));
			System.out.println("Salário Líquido: R$" + salarioLiquido);
		} else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			ir = (salarioBruto * 5) / 100;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.println("Salário Bruto R$" + salarioBruto);
			System.out.println("IR 5%: R$" + ir);
			System.out.println("INSS: R$" + inss);
			System.out.println("FGTS: R$" + fgts);
			System.out.println("Total de descontos: R$" + (ir + inss));
			System.out.println("Salário Líquido: R$" + salarioLiquido);
		} else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			ir = (salarioBruto * 10) / 100;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.println("Salário Bruto R$" + salarioBruto);
			System.out.println("IR 10%: R$" + ir);
			System.out.println("INSS: R$" + inss);
			System.out.println("FGTS: R$" + fgts);
			System.out.println("Total de descontos: R$" + (ir + inss));
			System.out.println("Salário Líquido: R$" + salarioLiquido);
		} else if (salarioBruto > 2500.00) {
			ir = (salarioBruto * 20) / 100;
			salarioLiquido = salarioBruto - ir - inss;
			System.out.println("Salário Bruto R$" + salarioBruto);
			System.out.println("IR 20%: R$" + ir);
			System.out.println("INSS: R$" + inss);
			System.out.println("FGTS: R$" + fgts);
			System.out.println("Total de descontos: R$" + (ir + inss));
			System.out.println("Salário Líquido: R$" + salarioLiquido);
		}

	}

}
