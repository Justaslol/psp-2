import java.util.Map;

public class ElectricCar extends Vehicle{

	private final int DAY_PRICE = 40;
	
	public ElectricCar(Gearbox gearbox) {
		super(gearbox);
	}

	@Override
	public double price(int days) {
		double price = DAY_PRICE * days;
		for (Extension extension : getExtensions().values()) {
			price += extension.priceWithInsurance(days);
		}
		return price;
	}

}
