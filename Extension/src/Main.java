
public class Main {

	public static void main(String[] args) {
		
		Vehicle electricCar = new ElectricCar(Gearbox.AUTOMATIC);
		
		electricCar.addExtension("kasko", new KaskoInsurance(electricCar));
		electricCar.addExtension("comp", new CompulsoryInsurance(electricCar));
	
		Extension extension = electricCar.getExtension("kasko");
		
		double suma = electricCar.price(5);
		
		System.out.println(suma);

	}

}
