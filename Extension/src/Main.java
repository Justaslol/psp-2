
public class Main {

	public static void main(String[] args) {

		Vehicle electricCar = new ElectricCar(Gearbox.AUTOMATIC);

		double sumaBeKasko = electricCar.price(5);

		electricCar.addExtension("kasko", new KaskoInsurance(electricCar));
		// electricCar.addExtension("comp", new CompulsoryInsurance(electricCar));

		// Extension extension = electricCar.getExtension("kasko");

		double sumaSuKasko = electricCar.price(5);

		System.out.println("Suma be kasko: " + sumaBeKasko);
		System.out.println("Suma su kasko: " + sumaSuKasko);

	}

}
