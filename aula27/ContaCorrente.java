package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ContaCorrente {
	int conta;
	String nome;
	double saldo;
	double saldoEspecial;
	boolean especial;
	boolean checkSaldo, checkSaque, checkHome;
	int menu;

	Scanner input = new Scanner(System.in);

	double sacarDinheiro(double saque) {
		saque = 0;
		checkSaque = false;
		do {
			System.out.println(saldo + "R$ disponível para saque.");
			System.out.print("Digite o valor do saque: ");
			saque = input.nextDouble();
			if (saldo <= saque) {
				System.out.println("Saldo indisponível");
				if (especial) {
					saldo += saque;
					this.saldoEspecial = gastarEspecial(0);
					checkSaque = true;
				}
			}
		} while (saldo <= saque && !checkSaque);
		return saldo - saque;
	}

	double depositarDinheiro(double dinheiro) {
		System.out.print("Digite o valor do depósito: ");
		dinheiro = input.nextDouble();
		return dinheiro += this.saldo;
	}

	void consultarSaldo() {
		System.out.println("Seu saldo disponível: R$" + this.saldo);
	}

	void getChequeEspecial() {
		if (this.especial == true) {
			System.out.println("Especial | Limite Disponível: R$" + saldoEspecial);
		}
	}

	double gastarEspecial(double saque) {
			do {
				System.out.println("Cheque Especial R$" + saldoEspecial);
				System.out.println("Digite o valor do saque Especial: ");
				saque = input.nextDouble();
				if (saque > saldoEspecial) {
					System.out.println("Saldo indisponível");
				}
				this.saldo -= saque;
			} while (saque >= saldoEspecial);
		return saldoEspecial -= saque;
	}

	int home() {
		checkHome = false;
		while (!checkHome) {
			System.out.println("::::::::: Banco Caixa Econômica :::::::::");
			System.out.println("Nome: " + this.nome + " | Nº Conta: " + this.conta);
			if (this.especial == true) {
				this.getChequeEspecial();
			}
			System.out.println("1 - Saque\n2 - Depósito\n3 - Consulta");
			menu = input.nextInt();
			if (menu != 1 && menu != 2 && menu != 3) {
				System.out.println("Não existe essa opção.");
			} else {
				checkHome = true;
			}
		}
		return menu;
	}
}