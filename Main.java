

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//khai bao
		PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
		PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
		PaperCurrencyDispenser twentyDispenser = new TwentyDispenser();
		PaperCurrencyDispenser tenDispenser = new TenDispenser();
		//set next 
		hundredDispenser.setNextDispenser(fiftyDispenser);
		fiftyDispenser.setNextDispenser(twentyDispenser);
		twentyDispenser.setNextDispenser(tenDispenser);
		//main 
		try (Scanner scanner = new Scanner(System.in)) {
			
				System.out.println(
					"Please enter amount to withdraw (multiple of 10, max 1000) ");
				int amount = scanner.nextInt();
				if (isValid(amount)) {
					hundredDispenser.dispense(amount);
				}
		}
	}

	private static boolean isValid(int amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount. Try again!");
			return false;
		} else if (amount > 1000) {
			System.out.println("Daily withdrawal limit is 1000. Try again!");
			return false;
		} else if (amount % 10 != 0) {
			System.out.println("Amount must be mutiple of 10s, Try again!");
			return false;
		}
		return true;
	}

}
