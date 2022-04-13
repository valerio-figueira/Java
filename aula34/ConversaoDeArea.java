package com.valerio.cursojava.aula34;

public class ConversaoDeArea {
	static private double pesQuadrados;
	static private double centimetrosQuadrados;
	static private double acres;

	public static double getPesQuadrados() {
		return pesQuadrados;
	}

	public static void setPesQuadrados(double pesQuadrados) {
		ConversaoDeArea.pesQuadrados = pesQuadrados;
	}

	public static double getCentimetrosQuadrados() {
		return centimetrosQuadrados;
	}

	public static void setCentimetrosQuadrados(double centimetrosQuadrados) {
		ConversaoDeArea.centimetrosQuadrados = centimetrosQuadrados;
	}

	public static double getAcres() {
		return acres;
	}

	public static void setAcres(double acres) {
		ConversaoDeArea.acres = acres;
	}

	static double metrosParaPesQuadrados(double metrosQuadrados) {
		setPesQuadrados(metrosQuadrados *= 10.76);
		return getPesQuadrados();
	}

	static double pesParaCentimetrosQuadrados(double pesQuadrados) {
		setCentimetrosQuadrados(pesQuadrados *= 929);
		return getCentimetrosQuadrados();
	}

	static double milhasEmAcres(double milhas) {
		setAcres(milhas *= 640);
		return getAcres();
	}

	static double acresEmPesQuadrados(double acres) {
		setPesQuadrados(acres *= 43560);
		return getPesQuadrados();
	}
}
