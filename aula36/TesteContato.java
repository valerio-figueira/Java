package com.valerio.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		Contato c = new Contato();

		c.setNome("Juca Pirama");

		Endereco e = new Endereco();
		Telefone[] t = new Telefone[2];

		e.setRua("Governador Valadares");
		e.setNumero("135");
		e.setBairro("Centro");
		e.setCidade("Uberlândia");
		e.setCep("38475-000");
		e.setEstado("MG");

		c.setEndereco(e);
		c.setTelefones(t);

		System.out.println(c.getEndereco().getCidade());

		Telefone t1 = new Telefone();
		t[0] = t1;
		t1.setTipo("Celular");
		t1.setDdd("34");
		t1.setNumero("99999-9999");

		Telefone t2 = new Telefone();
		t[1] = t2;
		t2.setTipo("Celular");
		t2.setDdd("34");
		t2.setNumero("99999-9999");

		if (c != null && c.getTelefones() != null) {
			for (Telefone tel : c.getTelefones()) {
				System.out.println(tel.getDdd() + " " + tel.getNumero());
			}
		}
	}
}