import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade de João: ");
		int idade1 = entrada.nextInt();
		
		System.out.println("Digite a idade de José: ");
		int idade2 = entrada.nextInt();
		
		System.out.println("Digite a idade de Maria: ");
		int idade3 = entrada.nextInt();
		
		if ((idade1 < idade2 ) && (idade1 < idade3)) {
			System.out.println("João é o caçula.");
			
		} else if ((idade2 < idade1) && (idade2 < idade3)){
			System.out.println("José é o caçula.");
		}else {
			System.out.println("Maria é a caçula.");
		}
		entrada.close();
		
		
	}

}
