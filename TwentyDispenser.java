

public class TwentyDispenser extends PaperCurrencyDispenser {

	public TwentyDispenser() {
		super();
	}

	@Override
	public void dispense(int money) {
		
		int remainder = 0;
		if (money >= 20) {
			int count = money / 20;
			remainder = money % 20;
			System.out.printf("Dispensing '%d' 20.\n", count);
		}
		if (remainder > 0 && this.nextDispenser != null) {
			this.nextDispenser.dispense(remainder);
		}
		}

}
