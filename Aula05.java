package Exerc�cios;

import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		// �ndice de massa corporal 
		
		Scanner IMC = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = IMC.next();
		
		System.out.println("Bem vindo a calculadora de IMC " + nome + ". " + "Digite sua altura: ");
		
		double altura = IMC.nextDouble();
		
		System.out.println("Agora, digite seu peso: ");
		
		double peso = IMC.nextDouble();
		
		double imc = peso / (altura * 2); 
		
		System.out.println("Seu �ndice de massa corporal �: " + imc);
		
		IMC.close();
	}

}
