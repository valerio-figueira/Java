package com.valerio.cursojava.aula46.labs;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras;
		figuras = new ArrayList<FiguraGeometrica>();

		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();

		Esfera esfera = new Esfera();
		Piramide piramide = new Piramide();
		Cubo cubo = new Cubo();

		circulo.setNome("Círculo");
		circulo.setRaio(5);

		triangulo.setNome("Triângulo");
		triangulo.setBase(5);
		triangulo.setAltura(15);

		quadrado.setNome("Quadrado");
		quadrado.setLado(5);

		esfera.setNome("Esfera");
		esfera.setRaio(8);

		piramide.setNome("Pirâmide");
		piramide.setAltura(0);
		piramide.setApotemaBase(0);
		piramide.setApotemaLateral(0);
		piramide.setArestaBase(0);
		piramide.setArestas(0);

		cubo.setNome("Cubo");
		cubo.setLado(6);

		figuras.add(circulo); // upcasting
		figuras.add(triangulo);
		figuras.add(quadrado);
		figuras.add(esfera);
		figuras.add(piramide);
		figuras.add(cubo);

		System.out.println("Figuras Geométricas:");
		for (FiguraGeometrica fgeometrica : figuras) {
			if (fgeometrica instanceof Figura2D) { // downcasting
				Figura2D figura2D = (Figura2D) fgeometrica;
				System.out.println(figura2D.toString());
			}
			System.out.println();
			if(fgeometrica instanceof Figura3D) { //downcasting
				Figura3D figura3d = (Figura3D) fgeometrica;
				System.out.println(figura3d.toString());
			}
		}

	}
}
