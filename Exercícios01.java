import java.util.Scanner;

public class Exercícios01 {

	// Intervalo entre 100 a 200
	
	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = number.nextInt();
		
		if ((n > 100) && (n < 200)) {
			System.out.println("Está no intervalo.");
		} else {
			System.out.println("Não está no intervalo.");
		}
		
		number.close();
		
		
	}

}
