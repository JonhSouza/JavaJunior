package Exerc�cios;

import java.util.Scanner;

public class aula06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		int valor1 = sc.nextInt();
		
		if(valor1 % 2 == 0) {
			System.out.println("� par!");
		} else System.out.println("� �mpar!");
		
		sc.close();
	}


	}

