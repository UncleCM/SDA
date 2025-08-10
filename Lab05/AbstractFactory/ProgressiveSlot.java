
public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;
	
	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
		this.name = "Progressive Slot";
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
