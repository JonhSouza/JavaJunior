package Exercícios;

import java.util.Scanner;

public class aula08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe outro valor");
		int valor2 =  sc.nextInt();
		
		int soma = valor1 + valor2;
		
		int valor = (soma >= 20) ? soma + 10 : soma - 5;
		System.out.println("O resultado será: " + valor);
		
		sc.close();
	}

}
