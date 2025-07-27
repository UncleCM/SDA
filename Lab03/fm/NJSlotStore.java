
public class NJSlotStore extends SlotStore {

	protected Slot makeSlot(slottype type) {
		double multiplier = 1.1;
		Slot tmp = null;
		if (type.equals(slottype.progressive)) { 
			tmp = new NJSlotProgressive();
			tmp.cost=(float) (tmp.cost*multiplier);
		}
		else if (type.equals(slottype.straight)) {
			tmp = new NJSlotStraight();
			tmp.cost=(float) (tmp.cost*multiplier);
		}
		else if (type.equals(slottype.bonus)) {
			tmp = new NJSlotBonus();
			tmp.cost=(float) (tmp.cost*multiplier);
		}
		return tmp;
	}
}
