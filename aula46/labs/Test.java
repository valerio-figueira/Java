package com.valerio.cursojava.aula46.labs;

import java.util.ArrayList;

import TypeInfoLibrary.TypeInfo;

public class Test {

	public static void main(String[] args) {
		TypeInfo type = new TypeInfo();

		Figura2D circulo = new Circulo();
		Figura2D triangulo = new Triangulo();
		Figura2D quadrado = new Quadrado();

		Figura3D esfera = new Esfera();
		Figura3D piramide = new Piramide();
		Figura3D cubo = new Cubo();

		circulo.setNome("Círculo");
		triangulo.setNome("Triângulo");
		quadrado.setNome("Quadrado");
		esfera.setNome("Esfera");
		piramide.setNome("Pirâmide");
		cubo.setNome("Cubo");

		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		figuras.add(circulo);
		figuras.add(triangulo);
		figuras.add(quadrado);
		figuras.add(esfera);
		figuras.add(piramide);
		figuras.add(cubo);

		for (FiguraGeometrica list : figuras) {
			type.typeText(list.toString());
		}
	}
}
