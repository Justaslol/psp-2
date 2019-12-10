
public interface Visitor {

	public double visit(CargoCar cargo);
	public double visit(CityCar city);
	public double visit(ElectricCar electric);
	
}
