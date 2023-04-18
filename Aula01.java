package Exercícios;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Digite a distância percorrida: ");
	
	double distancia = sc.nextDouble();
	
	System.out.println("Digite a quantidade de combustível gasto: ");
	
	double combustivel = sc.nextDouble();
	
	double cm = distancia / combustivel;
	
	System.out.println("A média de consumo gasto é: " + cm);
	sc.close();
	}

}
