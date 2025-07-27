public class WGSlotStore extends SlotStore {
    protected Slot makeSlot(slottype type) {
        double multiplier = 0.8;
		Slot tmp = null;
		if (type.equals(slottype.progressive)) { 
			tmp = new NJSlotProgressive();
			tmp.cost=(float) (tmp.cost*multiplier);
		}
        else if (type.equals(slottype.straight)) {
            tmp = new WGSlotStraight();
            tmp.cost=(float) (tmp.cost*multiplier);
        }
        else if (type.equals(slottype.bonus)) {
            tmp = new WGSlotBonus();
            tmp.cost=(float) (tmp.cost*multiplier);
        }
		return tmp;
	}
}
