
public abstract class Vehicle {

	private Gearbox gearbox;

	public Vehicle(Gearbox gearbox) {
		this.gearbox = gearbox;
	}

	public Gearbox getGearbox() {
		return gearbox;
	}

	public void setGearbox(Gearbox gearbox) {
		this.gearbox = gearbox;
	}
	
	public abstract double price(int days);
	
	public abstract double accept(Visitor visitor);
}


