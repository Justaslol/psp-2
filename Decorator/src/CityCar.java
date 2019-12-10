
public class CityCar extends Vehicle implements Transport{

	private final int DAY_PRICE = 30;
	
	public CityCar(Gearbox gearbox) {
		super(gearbox);
		
	}

	@Override
	public double price(int days) {
		switch(getGearbox()) {
		case MANUAL:
			return DAY_PRICE * days;
		case AUTOMATIC:
			return DAY_PRICE * days * 1.5;
		}
		throw new IllegalStateException("Non-existent gearbox type");
	}

}
