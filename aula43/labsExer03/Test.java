package com.valerio.cursojava.aula43.labsExer03;

public class Test {
	public static void printDescription(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {

		Aquatico peixe = new Aquatico();
		peixe.setNome("Lambari");
		peixe.setTipo("Aquático");
		peixe.setCor("Prateado");
		peixe.setComprimento(6);
		peixe.setVelocidade(0.9);
		peixe.setAmbiente("Ribanceiras");
		peixe.setCaracteristica("Escamas pequenas");

		Terrestre reptil = new Terrestre();
		reptil.setNome("Salamandra");
		reptil.setTipo("Anfíbio");
		reptil.setCor("Vermelha");
		reptil.setComprimento(10);
		reptil.setVelocidade(1.2);
		reptil.setAmbiente("Terrestre");

		Alado ave = new Alado();
		ave.setNome("Rolinha");
		ave.setTipo("Alado");
		ave.setCor("Marrom");
		ave.setComprimento(8);
		ave.setVelocidade(1.4);
		ave.setAmbiente("Ar");
		ave.setCaracteristica("Penas");

		Mamifero terrestre = new Mamifero();
		terrestre.setNome("Lobo");
		terrestre.setTipo("Terrestre");
		terrestre.setAlimento("Carne");
		terrestre.setCor("Cinza");
		terrestre.setComprimento(68);
		terrestre.setVelocidade(2.3);
		terrestre.setAmbiente("Florestas");

		printDescription("Animais:");
		printDescription(peixe.toString());
		printDescription(reptil.toString());
		printDescription(ave.toString());
	}
}
