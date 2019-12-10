
public class ElectricCar extends Vehicle{

	private final int DAY_PRICE = 40;
	
	public ElectricCar(Gearbox gearbox) {
		super(gearbox);
	}

	@Override
	public double price(int days) {
		return DAY_PRICE * days;
	}
	
	//Visitor accept
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
