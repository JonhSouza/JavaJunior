package Exerc�cios;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		
		Scanner loja = new Scanner(System.in);
		
		System.out.println("Digite o pre�o da compra: ");
		
		double preco = loja.nextDouble();
		
		System.out.println("Digite o n�mero de vezes cujo qual deseja parcelar a compra: ");
		
		double parcelas = loja.nextDouble();
		
		double finalizacao = preco / parcelas;
		
		System.out.println("Sua compra foi parcelada em " + parcelas + " vezes, " + "totalizando parcelas de $" + finalizacao);
		
		loja.close();
	}

}

