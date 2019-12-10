
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
}
