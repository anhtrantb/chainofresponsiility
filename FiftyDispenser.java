

public class FiftyDispenser extends PaperCurrencyDispenser {

	public FiftyDispenser() {
		super();
	}

	@Override
	public void dispense(int money) {
		
		int remainder = 0;
		if (money >= 50) {
			int count = money / 50;
			remainder = money % 50;
			System.out.printf("Dispensing '%d' 50.\n", count);
		}
		if (remainder > 0 && this.nextDispenser != null) {
			this.nextDispenser.dispense(remainder);
		}
		}
	

}
