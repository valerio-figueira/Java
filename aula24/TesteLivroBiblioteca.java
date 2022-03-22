package com.valerio.cursojava.aula24;

import java.util.Date;

public class TesteLivroBiblioteca {

	public static void main(String[] args) {
		LivroBiblioteca livro = new LivroBiblioteca();
		livro.title = "Eneid";
		livro.author = "Virgil";
		livro.publishing = "Penguin";
		livro.pages = 320;
		livro.borrowed = true;
		livro.whoTakeIt = "Pedro Fiel";
		livro.date = new Date();
	}
}