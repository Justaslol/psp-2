
public class KaskoInsurance extends TransportDecorator implements Insurance{

	public KaskoInsurance(Transport transport, String roleName) {
		super(transport, roleName);
	}

	private final int KASKO_DAY_PRICE = 25;
	
	@Override
	public double priceWithInsurance(int days) {

		return getTransport().price(days) + KASKO_DAY_PRICE * days;
	}

}
