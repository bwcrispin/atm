package atm;

public class Atm {
		
	private int balance;
		
	public Atm(int balance) {
		this.balance = balance;
	}
	
	public int checkBalance() {
		return balance;
	}
	
	public int withdraw() {
		int withdraw = 50;
		balance -= withdraw;
		return balance;
	}
	
	public int deposit() {
		int deposit = 50;
		balance += deposit;
		return balance;
	}

}
