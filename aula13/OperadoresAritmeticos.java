package com.valerio.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
	
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
	
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++); //primeiro imprime o valor do resultado e logo em seguida adiciona ++ ao valor imprimido, porém o valor só será imprimido no próximo print.out
		System.out.println(resultado);
		System.out.println(++resultado); //aqui o acréscimo vem antes do print.out, fazendo com que apareceça o acréscimo assim que o programa for executado.
		
		resultado += 1;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(resultado);
		
	}

}
