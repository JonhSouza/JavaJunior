package Exercícios;

import java.util.Scanner;

public class aula07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		int valor1 = sc.nextInt();
		
		String resultado = (valor1 % 2 == 0) ? "PAR" : "IMPAR";
		
		System.out.println(resultado);
		sc.close();
		
		
	}

}
