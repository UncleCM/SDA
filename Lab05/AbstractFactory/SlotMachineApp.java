public class SlotMachineApp {
	public static void main(String[] args) {
		System.out.println("=== Slot Machine Application using Abstract Factory Pattern ===\n");
		
		// Create factories for different locations
		AbstractSlotFactory njFactory = new NJSlotFactory();
		AbstractSlotFactory nvFactory = new NVSlotFactory();
		AbstractSlotFactory wgFactory = new WGSlotFactory();
		
		// Test New Jersey factory
		System.out.println("--- New Jersey Factory Test ---");
		Slot njSlot = njFactory.createBonusSlot();
		System.out.println("Taj Mahal ordered a " + njSlot + "\n");
		
		// Test Nevada factory
		System.out.println("--- Nevada Factory Test ---");
		Slot nvSlot = nvFactory.createProgressiveSlot();
		System.out.println("Peppermill ordered a " + nvSlot + "\n");
		
		// Test Washington factory
		System.out.println("--- Washington Factory Test ---");
		Slot wgSlot = wgFactory.createStraightSlot();
		System.out.println("Washington Casino ordered a " + wgSlot + "\n");
		
		System.out.println("=== All slot machines created successfully! ===");
	}
}
