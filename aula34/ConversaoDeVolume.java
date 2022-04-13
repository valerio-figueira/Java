package com.valerio.cursojava.aula34;

public class ConversaoDeVolume {
	private static double cmCubicos;
	private static double litros;
	private static double pesCubicos;
	private static double polegadasCubicas;
	
	static public double getCmCubicos() {
		return cmCubicos;
	}
	static public void setCmCubicos(double cmCubicos) {
		ConversaoDeVolume.cmCubicos = cmCubicos;
	}
	static public double getLitros() {
		return litros;
	}
	static public void setLitros(double litros) {
		ConversaoDeVolume.litros = litros;
	}
	static public double getPesCubicos() {
		return pesCubicos;
	}
	static public void setPesCubicos(double pesCubicos) {
		ConversaoDeVolume.pesCubicos = pesCubicos;
	}
	static public double getPolegadasCubicas() {
		return polegadasCubicas;
	}
	static public void setPolegadasCubicas(double polegadasCubicas) {
		ConversaoDeVolume.polegadasCubicas = polegadasCubicas;
	}	
}
