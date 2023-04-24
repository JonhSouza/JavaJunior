package aulasJava;

import java.util.Scanner;

public class aula17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//vetores
		int[] A = new int[5];
		int[] B = new int[5];
		
		//Para digitar algo q as vezes q vai se repetir na tela
		for (int i = 0; i <= 4; i++) {
			System.out.println("Informe uma nota");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		//Print do vetor A
		System.out.println("\n valores do Vetor A");
		for (int i = 0; i < A.length; i++) {
			System.out.println("valor:" +A[i]);
			
		//Print do vetor A	
		}
		System.out.println("\n valores do Vetor A");
		for (int i = 0; i < A.length; i++) {
			System.out.println("valor:" +A[i]);
			sc.close();
		}	
	}



		
	}


