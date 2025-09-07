
public class BarProducer extends Thread {
	Factory factory;
	public int count = 0; // each producer creates 50 bars
	public int id;
	private String factoryType;
	
	public BarProducer(int identifier, String type) {
		id = identifier;
		factoryType = type;
		System.out.println("Creating new Bar Producer with ID: " + id + " for " + type + " bars");
		
		// Initialize the appropriate factory using singleton pattern
		if ("Wonka".equals(type)) {
			factory = WonkaBarFactory.getInstance();
		} else if ("OompaLoompa".equals(type)) {
			factory = OompaLoompaBarFactory.getInstance();
		}
	}
	
	// Backward compatibility constructor
	public BarProducer(int identifier) {
		this(identifier, "Wonka");
	}
	  
	public void run() {     	
		while (count < 50) {
			try {
				sleep(100);
			} catch (InterruptedException e) {}
			count++;
			factory.create(id);
		}
		System.out.println("Producer " + id + " finished creating 50 " + factoryType + " bars");
	}
}