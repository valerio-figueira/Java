package com.valerio.cursojava.aula34;

public class ObjetoConversaoDeUnidadesDeArea {

	static void showNum(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		showNum(ConversaoDeArea.metrosParaPesQuadrados(5));

		showNum(ConversaoDeArea.pesParaCentimetrosQuadrados(10));

		showNum(ConversaoDeArea.milhasEmAcres(3));

		showNum(ConversaoDeArea.acresEmPesQuadrados(2));
	}
}
