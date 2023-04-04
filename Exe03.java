import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// Aceitar apenas a vogal "a"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma vogal: ");
		char vogal = sc.next().charAt(0);
		
		if (vogal == ('A')) {
			System.out.println("É vogal.");
		} else {
			System.out.println("Não é vogal.");
		}
		
	}

}
