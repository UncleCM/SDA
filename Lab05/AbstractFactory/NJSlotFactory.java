
public class NJSlotFactory implements AbstractSlotFactory {

	@Override
	public Slot createStraightSlot() {
		SlotComponentFactory componentFactory = new NJSlotComponentFactory();
		Slot slot = new StraightSlot(componentFactory);
		slot.setName("New Jersey Style Straight Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createBonusSlot() {
		SlotComponentFactory componentFactory = new NJSlotComponentFactory();
		Slot slot = new BonusSlot(componentFactory);
		slot.setName("New Jersey Style Bonus Slot");
		slot.build();
		return slot;
	}
	
	@Override
	public Slot createProgressiveSlot() {
		SlotComponentFactory componentFactory = new NJSlotComponentFactory();
		Slot slot = new ProgressiveSlot(componentFactory);
		slot.setName("New Jersey Style Progressive Slot");
		slot.build();
		return slot;
	}
}