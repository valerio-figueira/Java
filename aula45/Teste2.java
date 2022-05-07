package com.valerio.cursojava.aula45;

public class Teste2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object obj1 = obterString();
		String s1 = (String) obj1; // downcasting, porque a String é uma subclass da Object

		Object obj2 = "Outra String";
		String s2 = (String) obj2;

		Object obj3 = new Object(); // dará erro porque não faz referência a string nenhuma
		String s3 = (String) obj3;

		Object obj4 = obterInteiro(); // não funciona
		String s4 = (String) obj4;
	}

	public static String obterString() {
		return "uma String";
	}

	public static int obterInteiro() {
		return 5;
	}
}
