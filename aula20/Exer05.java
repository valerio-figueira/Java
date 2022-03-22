package com.valerio.cursojava.aula20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		home();
	}

	public static void home() {
		String[][] schedule = new String[31][18];
		int menu = 0;
		menu = home(0);
		while (true) {
			switch (menu) {
			case 1: {
				agendamento(schedule);
				menu = home(0);
				break;
			}
			case 2: {
				editarAgenda(schedule);
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
		String[] month = new String[13];
		int twelveMonths = getNumberMonth(0);
		getMonth(month, twelveMonths);
		int day = setDay(0);
		int hour = setHour(0);
		schedule[day][hour] = setTask(schedule[day][hour]);
		System.out.print("Agendado: " + schedule[day][hour] + " | Mês: " + month[twelveMonths] + " | Dia: " + day + " | Hora: "
				+ hour + ":00h\n\n");
	}

	public static void editarAgenda(String[][] schedule) {
		System.out.println(":::::: Alterar Agenda ::::::");
		String month[] = new String[13];
		int twelveMonths = getNumberMonth(0);
		getMonth(month, twelveMonths);
		int day = setDay(0);
		int hour = setHour(0);
		System.out.println("Tarefa selecionada: " + schedule[day][hour]);
		schedule[day][hour] = setTask(schedule[day][hour]);
		System.out.print("Tarefa Alterada para: " + schedule[day][hour] + " | Mês: " + month[twelveMonths] + " | Dia: "
				+ day + " | Hora: " + hour + ":00h\n\n");
	}

	public static void consultarAgenda(String[][] schedule) {
		System.out.println(":::::: Consultar Agenda ::::::");
		int day = setDay(0);
		int hour = setHour(0);
		System.out.println(
				"Descrição da consulta: " + schedule[day][hour] + " | Dia: " + day + " | Hora: " + hour + ":00h\n");
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
			System.out.print("Digite a hora do dia(9:00/17:00): ");
			num = input.nextInt();
		} while (num < 9 || num > 17);
		return num;
	}

	public static String setTask(String description) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a descrição da tarefa: ");
		description = input.nextLine();
		return description;
	}

	public static int getNumberMonth(int num) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Selecione o mês(1/12): ");
			num = input.nextInt();
		} while (num < 1 || num > 12);
		return num;
	}

	public static String getMonth(String[] month, int num) {
		switch (num) {
		case 1: {
			month[num] = "Janeiro";
			break;
		}
		case 2: {
			month[num] = "Fevereiro";
			break;
		}
		case 3: {
			month[num] = "Março";
			break;
		}
		case 4: {
			month[num] = "Abril";
			break;
		}
		case 5: {
			month[num] = "Maio";
			break;
		}
		case 6: {
			month[num] = "Junho";
			break;
		}
		case 7: {
			month[num] = "Julho";
			break;
		}
		case 8: {
			month[num] = "Agosto";
			break;
		}
		case 9: {
			month[num] = "Setembro";
			break;
		}
		case 10: {
			month[num] = "Outubro";
			break;
		}
		case 11: {
			month[num] = "Novembro";
			break;
		}
		case 12: {
			month[num] = "Dezembro";
			break;
		}
		}
		return month[num];
	}
}