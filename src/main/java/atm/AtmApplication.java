package atm;

import java.util.Scanner;

public class AtmApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Atm myAtm = new Atm(100);
		
		System.out.println("Please make your choice below:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		
		int numChoice = input.nextInt();
		
		if (numChoice == 1 ) {
			System.out.println("Your balance is " + myAtm.checkBalance() + ".");
		}
		
	}

}
