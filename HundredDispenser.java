

public class HundredDispenser extends PaperCurrencyDispenser {

	public HundredDispenser() {
		super();
	}

	@Override
	public void dispense(int money) {
		int remainder = 0;
		if (money >= 100) {
			int count = money / 100;
			remainder = money % 100;
			System.out.printf("Dispensing '%d' 100.\n", count);
		}
		if (remainder > 0 && this.nextDispenser != null) {
			this.nextDispenser.dispense(remainder);
		}
	}

}
