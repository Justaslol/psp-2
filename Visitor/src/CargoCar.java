
public class CargoCar extends Vehicle{

	private final int DAY_PRICE = 50;
	private int capacity;
	
	public CargoCar(Gearbox gearbox, int capacity) {
		super(gearbox);
		this.capacity = capacity;
	}

	@Override
	public double price(int days) {
		if (capacity > 5) {
			switch(getGearbox()) {
			case MANUAL:
				return DAY_PRICE * days * 1.2;
			case AUTOMATIC:
				return DAY_PRICE * days * 1.7;
			}
		} else {
			switch(getGearbox()) {
			case MANUAL:
				return DAY_PRICE * days;
			case AUTOMATIC:
				return DAY_PRICE * days * 1.5;
			}
		}
		throw new IllegalStateException("Non-existent gearbox type");
	}
	
	//Visitor accept
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
