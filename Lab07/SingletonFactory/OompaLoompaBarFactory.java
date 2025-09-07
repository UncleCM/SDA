public class OompaLoompaBarFactory implements Factory {
	private int counter = 0;
	
	// Thread-safe singleton using initialization-on-demand holder pattern
	private OompaLoompaBarFactory() {
		System.out.println("OompaLoompaBarFactory instance created - Singleton pattern ensures only one instance!");
	}
	
	private static class SingletonHolder {
		private static final OompaLoompaBarFactory INSTANCE = new OompaLoompaBarFactory();
	}
	
	public static OompaLoompaBarFactory getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public synchronized Bar create(int producerId) {
		Bar bar = new OompaLoompaBar(counter);
		System.out.println("Producer " + producerId + " created OompaLoompa bar with unique ID: " + counter);
		counter++;
		return bar;
	}
}
