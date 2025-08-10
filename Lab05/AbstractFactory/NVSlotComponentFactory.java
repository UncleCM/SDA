
public class NVSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new largeCabinet();
	}
	public Display createDisplay() {
		return new LCD();
	}
	
	@Override
	public Payment createPayment() {
		return new TicketInTicketOut();
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
