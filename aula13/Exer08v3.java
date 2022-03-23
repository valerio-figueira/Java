
import java.util.Scanner;
public class Exer08v3 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("Digite o valor do Salário em horas R$ ");
		double salarioHoras = key.nextDouble();
		System.out.println("Digite as horas de trabalho no mês: ");
		double horasMes = key.nextDouble();	
		double salarioTotal = salarioHoras * horasMes;
		System.out.println("O total do seu salário é:"+salarioTotal);
		
	}

}