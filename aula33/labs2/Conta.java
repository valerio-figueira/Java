package com.valerio.cursojava.aula33.labs2;

import java.util.Scanner;

public class Conta {
	Scanner scanner = new Scanner(System.in);
	private String nome;
	private int conta;
	private double saldo;
	private double limite;
	private boolean especial;
	private double saque;
	private double deposito;

	public Conta() {
	}

	public Conta(String nome, int conta, double saldo, double limite, boolean especial, double saque, double deposito) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
		this.limite = limite;
		this.especial = especial;
		this.saque = saque;
		this.deposito = deposito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	boolean sacarDinheiro() {
		saque = typeNum("Digite o valor do saque: ");
		if (saldo >= saque) {
			saldo -= saque;
			System.out.println("Limite: " + limite);
			System.out.println("Saldo: " + saldo);
			return true;
		} else {
			if (especial) {
				limite = limite + saldo; // utiliza o restante do saldo
				if (limite >= saque) {
					limite -= saque;
					saldo -= saque;
					System.out.println("Limite: " + limite);
					System.out.println("Saldo: " + saldo);
					return true;
				} else {
					System.out.println("Limite insuficiente para saque.");
					return false;
				}
			} else {
				System.out.println("Conta não é especial.");
				return false;
			}
		}
	}

	double depositarVerba() {
		deposito = typeNum("O valor do depósito: ");
		return saldo += deposito;
	}

	String consultarProventos() {
		String status = "Saldo: " + saldo;
		System.out.println(status);
		return status;
	}

}
