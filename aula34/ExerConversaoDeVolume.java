package com.valerio.cursojava.aula34;

public class ExerConversaoDeVolume {

	static void showMedidas(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		showMedidas(ConversaoDeVolumeController.galaoAmericanoParaLitros(5));

		showMedidas(ConversaoDeVolumeController.galaoAmericanoParaPolegadas(4));

		showMedidas(ConversaoDeVolumeController.litrosParaCmCubicos(2));

		showMedidas(ConversaoDeVolumeController.metrosParaLitros(5));

		showMedidas(ConversaoDeVolumeController.metrosParaPesCubicos(3));

	}
}
