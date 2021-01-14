

public class TenDispenser extends PaperCurrencyDispenser {

	public TenDispenser() {
		super();
	}

	@Override
	public void dispense(int money) {
		
		int remainder = 0;
		if (money >= 10) {
			int count = money / 10;
			remainder = money % 10;
			System.out.printf("Dispensing '%d' 10.\n", count);
		}
		if (remainder > 0 && this.nextDispenser != null) {
			this.nextDispenser.dispense(remainder);
		}
		}
	

}
