package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		int diaSemana = key.nextInt();
		/*
		if(diaSemana == 1) {
			System.out.println("Domingo");
		}else if (diaSemana == 2) {
			System.out.println("Segunda");
		}else if (diaSemana == 3) {
			System.out.println("Terça");
		}else if (diaSemana == 4) {
			System.out.println("Quarta");
		}else if (diaSemana == 5) {
			System.out.println("Quinta");
		}else if (diaSemana == 6) {
			System.out.println("Sexta");
		}else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else { System.out.println("Não é um dia da semana válido.");
		} */

		/*
		switch(diaSemana) {
		case 1: System.out.println("Segunda"); break;
		case 2: System.out.println("Terça"); break;
		case 3: System.out.println("Quarta"); break;
		case 4: System.out.println("Quinta"); break;
		case 5: System.out.println("Sexta"); break;
		case 6: System.out.println("Sábado"); break;
		case 7: System.out.println("Domingo"); break;
		default: System.out.println("Não é um dia da semana válido.");
		} */
		
		switch(diaSemana) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Dia útil"); break;
		case 6:
		case 7: System.out.println("Fim de Semana"); break;
		default: System.out.println("Não é um dia da semana válido.");
		}
		
	}

}
