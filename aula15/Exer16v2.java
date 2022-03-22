package com.valerio.cursojava.aula15;
import java.util.Scanner;
public class Exer16v2{
	public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	double a;//nosso A da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "a" é o 2. 
	double b;//nosso B da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "b" é o 3. 
	double c;//nosso C da equação. Por exemplo: 2X+3Y-10=0, nesse caso o "c" é o -10. 
	double delta;//nosso Delta. Delta = "B" ao quadrado menos 4 vezes "A" vezes "C". Lembra? 
	double x1;//nossa primeira raiz da equação. 
	double x2;//nossa segunda raiz da equação. 

	System.out.println("Insira o valor de A: ");
	a = scan.nextDouble();
	//a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));//Menssagem e leitura do "a" 

	while(a==0){ //Enquanto o valor de A for igual a zero repete a mensagem e pede outro valor . 	
		System.out.println("O valor de A não pode ser zero a equação é do 2º grau !\n Digite outro valor !"); 
		System.out.println("Insira o valor de A: ");
		a = scan.nextDouble(); //Menssagem e leitura do "a" 
	} 

	System.out.println("Insira o valor de B: ");
	b = scan.nextDouble();
	System.out.println("Insira o valor de C: ");
	c = scan.nextDouble();
	// b = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de B:"));//Menssagem e leitura do "b" 
	// c = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de C:"));//Menssagem e leitura do "c" 

	delta = ((b*b)-(4*a*c));//Fórmula do Delta 
	x1 = 0;//Definindo um valor inicial para o x1 
	x2 = 0;//Definindo um valor inicial para o x2 

	if (delta >= 0){ //Se o valor de delta for maior ou igual a zero podemos resolver... 
		x1 = (-b + Math.sqrt (delta)) / ( 2*a );//equação do x1 
		x2 = (-b - Math.sqrt (delta)) / ( 2*a ) ;//equação do x2 

		System.out.println("Delta vale :"+ delta); //Mostra o valor de Delta 
		System.out.println("\nx1 vale: "+ x1 + "\n x2 vale: "+ x2); //mostra o x1 e x2. 
	} 
	else{ //senão(se o delta não for maior nem igual a zero) não podemos resolver com números reais talves com números complexos podemos... 
		System.out.println("Não há soluções que possam ser expressas com o conjunto dos números reais ");//avisa que o delta deu condição complexa 
	} }
} 