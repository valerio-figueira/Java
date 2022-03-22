package com.valerio.cursojava.aula27;

import java.util.Scanner;

public class ContaCorrente {
	int conta, oid;
	String nome;
	double saldo, saldoEspecial;
	boolean especial;

	double sacarDinheiro(double saldo) {
		Scanner input = new Scanner(System.in);
		double saque = 0;
		if (saldo > 0) {
			do {
				System.out.println(saldo + "R$ disponível para saque.");
				System.out.print("Digite o valor do saque: ");
				saque = input.nextDouble();
				if (saque > saldo) {
					System.out.println("Saldo indisponível");
				}
			} while (saque > saldo);
		} else {
			System.out.println("Saldo indisponível.");
			if (especial == true) {
				this.saldoEspecial = gastarEspecial(0);
			}
		}
		return saldo - saque;
	}

	double depositarDinheiro(double dinheiro) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor do depósito: ");
		dinheiro = input.nextDouble();
		return dinheiro + this.saldo;
	}

	void consultarSaldo() {
		System.out.println("Seu saldo disponível: R$" + this.saldo);
	}

	void getChequeEspecial() {
		if (this.especial == true) {
			System.out.println("Especial | Limite Disponível: R$" + this.saldoEspecial);
		}
	}

	double gastarEspecial(double valor) {
		Scanner input = new Scanner(System.in);
		if (saldoEspecial > 0) {
			do {
				System.out.println("Cheque Especial R$" + this.saldoEspecial);
				System.out.println("Digite o valor do saque Especial: ");
				valor = input.nextDouble();
				if (valor > this.saldoEspecial) {
					System.out.println("Saldo indisponível");
				}
			} while (valor > this.saldoEspecial);
		}
		return this.saldoEspecial - valor;
	}

	int home(int menu) {
		Scanner input = new Scanner(System.in);
		boolean sair = false;
		while (!sair) {
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
				sair = true;
			}
		}
		return menu;
	}
}