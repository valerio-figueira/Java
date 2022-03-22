package com.valerio.cursojava.aula20;

import java.util.Scanner;

public class Exer04v2 {

	public static void main(String[] args) {
		home();
	}

	public static void home() {
		String[][] schedule = new String[31][24];
		int menu = 0, home = 1;

		menu = home(0);

		while (true) {
			switch (menu) {
			case 1: {
				agendamento(schedule);
				menu = home(0);
				break;
			}
			case 2: {
				alterarAgenda(schedule);
				menu = home(0);
				break;
			}
			case 3: {
				consultarAgenda(schedule);
				menu = home(0);
				break;
			}
			}
		}

	}

	public static void agendamento(String[][] schedule) {
		System.out.println(":::::: Agendar Tarefa ::::::");
		int day = setDay(0);
		int hour = setHour(0);
		schedule[day][hour] = setTask(schedule[day][hour]);
		System.out.print("Agendado: " + schedule[day][hour] + " | Dia: " + day + " | Hora: " + hour + "h\n\n");
	}

	public static void alterarAgenda(String[][] schedule) {
		System.out.println(":::::: Alterar Agenda ::::::");
		int day = setDay(0);
		int hour = setHour(0);
		System.out.println("Tarefa selecionada: " + schedule[day][hour]);
		schedule[day][hour] = setTask(schedule[day][hour]);
		System.out.print(
				"Tarefa Alterada para: " + schedule[day][hour] + " | Dia: " + day + " | Hora: " + hour + "h\n\n");
	}

	public static void consultarAgenda(String[][] schedule) {
		System.out.println(":::::: Consultar Agenda ::::::");
		int day = setDay(0);
		int hour = setHour(0);
		System.out.println(
				"Descrição da consulta: " + schedule[day][hour] + " | Dia: " + day + " | Hora: " + hour + "h\n");
	}

	public static int home(int num) {
		Scanner input = new Scanner(System.in);
		System.out.println(":::::: Agenda Home ::::::");
		do {
			System.out.println("1 - Agendar tarefa\n2 - Alterar agenda\n3 - Consultar agenda");
			num = input.nextInt();
		} while (num != 1 && num != 2 && num != 3);
		return num;
	}

	public static int setDay(int num) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Digite o dia do mês: ");
			num = input.nextInt();
		} while (num < 0 || num > 30);
		return num;
	}

	public static int setHour(int num) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Digite a hora do dia: ");
			num = input.nextInt();
		} while (num < 0 || num > 31);
		return num;
	}

	public static String setTask(String description) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a descrição da tarefa: ");
		description = input.nextLine();
		return description;
	}

	public static int backHome(int num) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Voltar ao menu Home? 1 - Sim | 2 - Não");
			num = input.nextInt();
		} while (num != 1 && num != 2);
		return num;
	}
}