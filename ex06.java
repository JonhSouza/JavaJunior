package javaCurso;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// Fórmula de Bhaskara
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor B: ");
		double b = sc.nextDouble();

		System.out.println("Digite o valor C: ");
		double c = sc.nextDouble();

		sc.close();
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
	
		double x1 = (-b + Math.sqrt(delta)) / 2.0 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2.0 * a;
		System.out.printf("Estes são os resultados de ambos os x: %.1f e %.1f.%n", x1, x2);
		
	
	}

}
