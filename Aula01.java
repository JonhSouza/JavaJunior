package Exerc�cios;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Digite a dist�ncia percorrida: ");
	
	double distancia = sc.nextDouble();
	
	System.out.println("Digite a quantidade de combust�vel gasto: ");
	
	double combustivel = sc.nextDouble();
	
	double cm = distancia / combustivel;
	
	System.out.println("A m�dia de consumo gasto �: " + cm);
	sc.close();
	}

}
