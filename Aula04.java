package Exerc�cios;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
			// Conversor de d�lar
		Scanner conversor = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio em D�lar: ");
		
		float salario = conversor.nextFloat();
		
		double cm = salario * 5.07;
		
		System.out.println("Teu sal�rio convertido em BRL �: " + cm);
		
		conversor.close();
	}

}
