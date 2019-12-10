
public class Main {

	public static void main(String[] args) {
		
		TransportDecorator insuredCar = new KaskoInsurance(new CompulsoryInsurance(new ElectricCar(Gearbox.AUTOMATIC), "compulsory"), "kasko");
		
//		insuredCar = insuredCar.removeRole("compulsory");
//		TransportDecorator d = insuredCar.getRole("compulsory");
		
		TransportDecorator d = insuredCar.getRole("compulsory");
		
		if (d != null && d instanceof Insurance) {
			System.out.println(((Insurance) d).priceWithInsurance(1));
		}
	}

}
