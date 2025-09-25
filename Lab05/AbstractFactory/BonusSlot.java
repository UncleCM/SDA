
public class BonusSlot extends Slot {
	SlotComponentFactory componentFactory;
	
	public BonusSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
		this.name = "Bonus Slot";
	}
 
	void build() {
		System.out.println("Building " + name);
		cabinet = componentFactory.createCabinet();
		display = componentFactory.createDisplay();
		payment = componentFactory.createPayment();
		gpu = componentFactory.createGPU();
		os = componentFactory.createOS();
	}
}
