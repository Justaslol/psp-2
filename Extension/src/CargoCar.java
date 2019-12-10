
public class CargoCar extends Vehicle{

	private final int DAY_PRICE = 50;
	private int capacity;
	
	public CargoCar(Gearbox gearbox, int capacity) {
		super(gearbox);
		this.capacity = capacity;
	}

	@Override
	public double price(int days) {
		double price = DAY_PRICE * days;
		if (capacity > 5) {
			price = price * 1.3;
		}
		
		for (Extension extension : getExtensions().values()) {
			price += extension.priceWithInsurance(days);
		}
		return price;
	}
}
