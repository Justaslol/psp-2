
public class CityCar extends Vehicle{

	private final int DAY_PRICE = 30;
	
	public CityCar(Gearbox gearbox) {
		super(gearbox);	
	}

	@Override
	public double price(int days) {
		double price = DAY_PRICE * days;
		switch(getGearbox()) {
		case MANUAL:
			for (Extension extension : getExtensions().values()) {
				price += extension.priceWithInsurance(days);
			}
		case AUTOMATIC:
			for (Extension extension : getExtensions().values()) {
				price += extension.priceWithInsurance(days);
			};
		}
		return price;
	}

}
