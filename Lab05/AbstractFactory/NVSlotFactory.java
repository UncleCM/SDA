
public class NVSlotFactory implements AbstractSlotFactory {

	@Override
	public Slot createStraightSlot() {
		SlotComponentFactory componentFactory = new NVSlotComponentFactory();
		Slot slot = new StraightSlot(componentFactory);
		slot.setName("Nevada Style Straight Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createBonusSlot() {
		SlotComponentFactory componentFactory = new NVSlotComponentFactory();
		Slot slot = new BonusSlot(componentFactory);
		slot.setName("Nevada Style Bonus Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createProgressiveSlot() {
		SlotComponentFactory componentFactory = new NVSlotComponentFactory();
		Slot slot = new ProgressiveSlot(componentFactory);
		slot.setName("Nevada Style Progressive Slot");
		slot.build();
		return slot;
	}
}