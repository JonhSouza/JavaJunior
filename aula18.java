package aulasJava;

import java.util.Scanner;

public class aula18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] valores = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite um número inteiro: ");
			valores[i] = entrada.nextInt();
		}
		System.out.println("+-- Vetor original --+");
		for (int i : valores) {
			System.out.println(i);
		}
		for (int i = 0; i <= 4; i++) {
			if (valores[i] % 2 == 0) {
				valores[i] = valores[i] * 3;
				System.out.printf("Vetor par: %d.%n", valores[i]);
			} else {
				valores[i] = valores[i] + 1;
				System.out.printf("Vetor ímpar: %d.%n", valores[i]);
			}
		}

		entrada.close();
	}

}
