
public class CompulsoryInsurance  implements Extension{

	private final int COMPULSORY_DAY_PRICE = 15;
	private Vehicle car;
	
	public CompulsoryInsurance(Vehicle car) {
		this.car = car;
	}

	
	
	@Override
	public double priceWithInsurance(int days) {

		return car.price(days) + COMPULSORY_DAY_PRICE * days;
	}

}
