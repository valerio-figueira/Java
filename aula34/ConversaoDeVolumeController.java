package com.valerio.cursojava.aula34;

public class ConversaoDeVolumeController {

	static double litrosParaCmCubicos(double cmCubicos) {
		ConversaoDeVolume.setCmCubicos(cmCubicos *= 1000);
		return ConversaoDeVolume.getCmCubicos();
	}

	static double metrosParaLitros(double litros) {
		ConversaoDeVolume.setLitros(litros *= 1000);
		return ConversaoDeVolume.getLitros();
	}

	static double metrosParaPesCubicos(double pesCubicos) {
		ConversaoDeVolume.setPesCubicos(pesCubicos *= 35.32);
		return ConversaoDeVolume.getPesCubicos();
	}

	static double galaoAmericanoParaPolegadas(double polegadasCubicas) {
		ConversaoDeVolume.setPolegadasCubicas(polegadasCubicas *= 231);
		return ConversaoDeVolume.getPolegadasCubicas();
	}

	static double galaoAmericanoParaLitros(double litros) {
		ConversaoDeVolume.setLitros(litros *= 3.785);
		return ConversaoDeVolume.getLitros();
	}
}
