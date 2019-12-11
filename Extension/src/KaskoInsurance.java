
public class KaskoInsurance implements Extension {

	private final int KASKO_DAY_PRICE = 25;
	private Vehicle car;

	public KaskoInsurance(Vehicle car) {
		this.car = car;
	}

	@Override
	public double priceWithInsurance(int days) {

		// return car.price(days) + KASKO_DAY_PRICE * days;
		return KASKO_DAY_PRICE * days;
	}

}
