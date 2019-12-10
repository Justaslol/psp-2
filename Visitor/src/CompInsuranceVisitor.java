
public class CompInsuranceVisitor implements Visitor{

	private int days;
	private final int COMPULSORY_DAY_PRICE = 15;
	
	
	public CompInsuranceVisitor(int days) {
		this.days = days;
	}

	public double visit(CargoCar cargo) {

		return cargo.price(days) + days * COMPULSORY_DAY_PRICE;
	}

	public double visit(CityCar city) {

		return city.price(days) + days * COMPULSORY_DAY_PRICE;
	}

	public double visit(ElectricCar electric) {
		
		return electric.price(days) + days * COMPULSORY_DAY_PRICE;
	}
	
	public void setDays(int days) {
		this.days = days;
	}

}
