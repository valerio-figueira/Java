package com.valerio.cursojava.aula24;

public class TesteContatoTelefone {

	public static void main(String[] args) {
		ContatoTelefone contato = new ContatoTelefone();
		contato.nome = "Pedro Fiel";
		contato.endereço = "Av. das Acácias Nº 760";
		contato.email = "pedrof@hotmail.com";
		contato.telefones = new String[5];
		contato.telefones[0] = "6548945";
		contato.telefones[1] = "6548894";
	}
}
