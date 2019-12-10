
public class ElectricCar extends Vehicle implements Transport{

	private final int DAY_PRICE = 40;
	
	public ElectricCar(Gearbox gearbox) {
		super(gearbox);
	}

	@Override
	public double price(int days) {
		return DAY_PRICE * days;
	}

}
