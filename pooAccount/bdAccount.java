package pooAccount;

public class bdAccount {

	private int number;
	private String holder;
	private double balance;
	
	public bdAccount() {
		
	}
	
	public bdAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public bdAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withDraw(double amount) {
		balance -= amount + 5.00;
	}
	public String toString() {
		return "bdAccount [number = " + number + ", holder = " + holder + ", balance = " + balance + "]";
	}
}
