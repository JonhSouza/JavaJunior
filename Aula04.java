package Exercícios;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
			// Conversor de dólar
		Scanner conversor = new Scanner(System.in);
		
		System.out.println("Digite seu salário em Dólar: ");
		
		float salario = conversor.nextFloat();
		
		double cm = salario * 5.07;
		
		System.out.println("Teu salário convertido em BRL é: " + cm);
		
		conversor.close();
	}

}
