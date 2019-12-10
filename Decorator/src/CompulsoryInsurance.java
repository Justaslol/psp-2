
public class CompulsoryInsurance extends TransportDecorator implements Insurance{

	public CompulsoryInsurance(Transport transport, String roleName) {
		super(transport, roleName);
	}

	private final int COMPULSORY_DAY_PRICE = 15;
	
	@Override
	public double priceWithInsurance(int days) {

		return getTransport().price(days) + COMPULSORY_DAY_PRICE * days;
	}

}
