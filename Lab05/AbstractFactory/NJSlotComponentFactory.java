
public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new smallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
	
	@Override
	public Payment createPayment() {
		return new Coins();
	}
	
	@Override
	public GPU createGPU() {
		return new ARM();
	}
	
	@Override
	public OS createOS() {
		return new WindowsME();
	}
}
