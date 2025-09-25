public class WGSlotFactory implements AbstractSlotFactory {

	@Override
	public Slot createStraightSlot() {
		SlotComponentFactory componentFactory = new WGSlotComponentFactory();
		Slot slot = new StraightSlot(componentFactory);
		slot.setName("Washington Style Straight Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createBonusSlot() {
		SlotComponentFactory componentFactory = new WGSlotComponentFactory();
		Slot slot = new BonusSlot(componentFactory);
		slot.setName("Washington Style Bonus Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createProgressiveSlot() {
		SlotComponentFactory componentFactory = new WGSlotComponentFactory();
		Slot slot = new ProgressiveSlot(componentFactory);
		slot.setName("Washington Style Progressive Slot");
		slot.build();
		return slot;
	}
}
