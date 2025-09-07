public class WonkaBarFactory implements Factory {
	private int counter = 0;
	
	// Thread-safe singleton using initialization-on-demand holder pattern
	private WonkaBarFactory() {
		System.out.println("WonkaBarFactory instance created - Singleton pattern ensures only one instance!");
	}
	
	private static class SingletonHolder {
		private static final WonkaBarFactory INSTANCE = new WonkaBarFactory();
	}
	
	public static WonkaBarFactory getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public synchronized Bar create(int producerId) {
		Bar bar = new WonkaBar(counter);
		System.out.println("Producer " + producerId + " created Wonka bar with unique ID: " + counter);
		counter++;
		return bar;
	}
}
