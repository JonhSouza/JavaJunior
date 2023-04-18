package Exercícios;

public class aula10 {

	public static void main(String[] args) {
		// 1- manhã 2 - tarde 3 - noite
		
		int turno = 8;
		switch (turno) {
		case 1:
			System.out.println("Manhã");
			break;
		case 2: 
			System.out.println("Tarde");
			break;
		case 3: 
			System.out.println("Noite");
		default:
			System.out.println("Opção inválida");
			break;
		}
		
	}

}
