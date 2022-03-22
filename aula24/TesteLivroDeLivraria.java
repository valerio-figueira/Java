package com.valerio.cursojava.aula24;

public class TesteLivroDeLivraria {
	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria();

		livro.title = "Metafísica";
		livro.author = "Aristóteles";
		livro.publishing = "Editora Paulus";
		livro.description = "O filósofo grego discorre sobre temas acerca da filosofia primeira e filosofia segunda, o ser enquanto ser, etc";
		livro.pages = 352;
		livro.price = 89.90;
	}
}
