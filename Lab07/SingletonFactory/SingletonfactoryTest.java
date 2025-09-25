public class SingletonfactoryTest {
	public static void main(String[] args) {
		System.out.println("=== Demonstrating Singleton Factory Pattern ===\n");
		
		// Test singleton pattern - both calls should return the same instance
		System.out.println("Testing Singleton Pattern:");
		Factory wonkaFactory1 = WonkaBarFactory.getInstance();
		Factory wonkaFactory2 = WonkaBarFactory.getInstance();
		Factory oompaFactory1 = OompaLoompaBarFactory.getInstance();
		Factory oompaFactory2 = OompaLoompaBarFactory.getInstance();
		
		System.out.println("WonkaBarFactory instances are same: " + (wonkaFactory1 == wonkaFactory2));
		System.out.println("OompaLoompaBarFactory instances are same: " + (oompaFactory1 == oompaFactory2));
		System.out.println();
		
		// Create multiple producers with different factory types
		System.out.println("Starting chocolate bar production with multiple threads:");
		BarProducer wonkaProducer1 = new BarProducer(1, "Wonka");
		BarProducer wonkaProducer2 = new BarProducer(2, "Wonka");
		BarProducer oompaProducer1 = new BarProducer(3, "OompaLoompa");
		BarProducer oompaProducer2 = new BarProducer(4, "OompaLoompa");
		
		// Start all producers
		wonkaProducer1.start();
		wonkaProducer2.start();
		oompaProducer1.start();
		oompaProducer2.start();
		
		// Wait for all threads to complete
		try {
			wonkaProducer1.join();
			wonkaProducer2.join();
			oompaProducer1.join();
			oompaProducer2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n=== Production Complete ===");
		System.out.println("Singleton pattern ensured thread-safe production with unique IDs!");
	}
}
