import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade de Jo�o: ");
		int idade1 = entrada.nextInt();
		
		System.out.println("Digite a idade de Jos�: ");
		int idade2 = entrada.nextInt();
		
		System.out.println("Digite a idade de Maria: ");
		int idade3 = entrada.nextInt();
		
		if ((idade1 < idade2 ) && (idade1 < idade3)) {
			System.out.println("Jo�o � o ca�ula.");
			
		} else if ((idade2 < idade1) && (idade2 < idade3)){
			System.out.println("Jos� � o ca�ula.");
		}else {
			System.out.println("Maria � a ca�ula.");
		}
		entrada.close();
		
		
	}

}
