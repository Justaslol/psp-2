
public class Main {

	public static void main(String[] args) {
		
		Visitor kaskoVisitor = new KaskoInsuranceVisitor(5);
		
		Visitor compulsoryVisitor = new CompInsuranceVisitor(5);
		
		Vehicle electricCar = new ElectricCar(Gearbox.AUTOMATIC);
		
		System.out.println("Regular price: " + electricCar.price(5));
		
		System.out.println("Price with kasko: " + electricCar.accept(kaskoVisitor));
		
		System.out.println("Price with compulsory: " + electricCar.accept(compulsoryVisitor));
	}

}
