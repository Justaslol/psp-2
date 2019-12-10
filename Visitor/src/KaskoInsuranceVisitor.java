
public class KaskoInsuranceVisitor implements Visitor{

	private int days;
	private final int KASKO_DAY_PRICE = 25;
		
	public KaskoInsuranceVisitor(int days) {
		this.days = days;
	}

	public double visit(CargoCar cargo) {

		return cargo.price(days) + days * KASKO_DAY_PRICE;
	}

	public double visit(CityCar city) {

		return city.price(days) + days * KASKO_DAY_PRICE;
	}

	public double visit(ElectricCar electric) {
		
		return electric.price(days) + days * KASKO_DAY_PRICE;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
}
