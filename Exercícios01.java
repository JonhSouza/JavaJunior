import java.util.Scanner;

public class Exerc�cios01 {

	// Intervalo entre 100 a 200
	
	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int n = number.nextInt();
		
		if ((n > 100) && (n < 200)) {
			System.out.println("Est� no intervalo.");
		} else {
			System.out.println("N�o est� no intervalo.");
		}
		
		number.close();
		
		
	}

}
