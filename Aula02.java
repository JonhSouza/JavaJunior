package Exerc�cios;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Voc� � maior de idade.");
		}else {
			System.out.println("Voc� � menor de idade.");
		}
		
		sc.close();
	}

}
