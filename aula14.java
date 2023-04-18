package Exercícios;

import java.util.Scanner;

public class aula14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int x = sc.nextInt();
		int maior = x;
		int menor = x;
		
		int n = 1;
				
				while (n <= 4) {

					System.out.println("Informe um valor: ");
					int y = sc.nextInt();
					
					if(y > maior) {
						maior = y;
					}
					if(y < menor) {
						menor = y;
					}
					n++;
				}
				System.out.println("Maior é: " + maior);
				System.out.println("Menor é: " + menor);
				
				sc.close();
	}

}
