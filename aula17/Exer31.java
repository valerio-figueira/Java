package com.valerio.cursojava.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario, percentual, perres;
		int ano;

		for (ano = 1995, salario = 1000.00, percentual = 1.5; ano <= 1996;) {
			System.out.println("Ano: " + ano + " | Salário: R$" + new DecimalFormat("#.00").format(salario));
			ano++;
			while (ano >= 1996 && ano < 1997) {
				salario = salario + (salario * percentual) / 100;
				System.out.println("Ano: " + ano + " | Salário: R$" + new DecimalFormat("#.00").format(salario));
				ano++;
			}
			while (ano >= 1997 && ano <= 2022) {
				salario = salario + ((salario * percentual) / 100);
				System.out.println("Ano: " + ano + " | Salário: R$" + new DecimalFormat("#.00").format(salario));
				ano++;
			}
		}

	}

}
