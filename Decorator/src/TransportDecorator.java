
public abstract class TransportDecorator implements Transport{

	private Transport transport;
	private String roleName;
	
	public TransportDecorator (Transport transport, String roleName) {
		this.transport = transport;
		this.roleName = roleName;
	}
	
	public TransportDecorator removeRole(String roleName) {
		if (this.getRoleName().equals(roleName)) {
			if (this.getTransport() instanceof TransportDecorator) {
				this.setRoleName(this.getVehicleDecorator().getRoleName());
				return (TransportDecorator) this.getTransport();
			} else {
				this.setRoleName("NO_ROLE");
			}
		} else {
			if (this.getTransport() instanceof TransportDecorator) {
				this.setTransport(((TransportDecorator) this.getTransport()).removeRole(roleName));
			}
		}	
		return this;
	}
	
	public TransportDecorator getRole(String name) {
		if ((this).getRoleName().equals(name)) {
			return this;
		} else {
			if (this.getTransport() instanceof TransportDecorator)
				return ((TransportDecorator) this.getTransport()).getRole(name);
		}
		return null;
	}
	
	@Override
	public double price(int days) {
		return transport.price(days);
	}
	
	public Transport getTransport() {
		return transport;
	}
	
	public TransportDecorator getVehicleDecorator() {
		return (TransportDecorator) transport;
	}
	
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName (String roleName) {
		this.roleName = roleName;
	}
}
