package pooAccount;

import java.util.Scanner;

public class account {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		bdAccount account = null;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account folder: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.println("Is there na initial deposit(y/n)? ");
		char resposta = sc.next().toLowerCase().charAt(0);

		if (resposta == 'y') {
			System.out.println("Enter initial deposite value: ");
			double amount = sc.nextDouble();
			account = new bdAccount(number, titular, amount);
		} else if (resposta == 'n') {
			account = new bdAccount(number, titular);
		} else {
			System.out.println("Invalid.");
		}

		System.out.println("Data Account: ");
		System.out.println(account);
		System.out.println("");
		System.out.println("Enter the withdraw value: ");
		account.withDraw(sc.nextDouble());
		System.out.println("Updated Data.");
		System.out.println(account);
		sc.close();
	}

}
