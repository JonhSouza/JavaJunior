package aulasJava;

import java.util.Scanner;

public class aula16 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua ID: ");
		int ID_funcionario = sc.nextInt();
		
		System.out.println("Digite suas planilha de horários(exemplo: 30 horas semanais = 30): ");
		int planilhaH = sc.nextInt();
		
		System.out.println("Digite seu salário por hora trabalhada: ");
		double salarioH = sc.nextDouble();
		
		double folhaDePagamento = (double) salarioH * planilhaH * 4;
		
		System.out.printf("a folha de pagamento do ID %d ao final de mês é: %.2f.%n", ID_funcionario ,folhaDePagamento);
		
	
		sc.close();
	}

}
