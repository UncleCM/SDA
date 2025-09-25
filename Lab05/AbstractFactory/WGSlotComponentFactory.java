public class WGSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new largeCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
	
	@Override
	public Payment createPayment() {
		return new Bills();
	}
	
	@Override
	public GPU createGPU() {
		return new ARM();
	}
	
	@Override
	public OS createOS() {
		return new Linux();
	}
}
