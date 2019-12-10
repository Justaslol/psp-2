import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle {

	private Gearbox gearbox;
	private Map<String, Extension> extensions = new HashMap<>();

	public Vehicle(Gearbox gearbox) {
		this.gearbox = gearbox;
	}

	public Gearbox getGearbox() {
		return gearbox;
	}

	public void setGearbox(Gearbox gearbox) {
		this.gearbox = gearbox;
	}
	
	public abstract double price(int nights);
	
	public Extension getExtension(String extensionType) {
		return extensions.get(extensionType);
	}
	
	public void addExtension(String extensionType, Extension extension) {
		extensions.put(extensionType, extension);
	}
	
	public Extension removeExtension(String extensionType) {
		return extensions.remove(extensionType);
	}
	
	public Map<String, Extension> getExtensions(){
		return extensions;
	}
}
