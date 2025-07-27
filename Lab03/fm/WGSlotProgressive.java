public class WGSlotProgressive extends Slot {
    public WGSlotProgressive() {
		name="Progressive";
		software = "Android";
		components.add("Large");
		components.add("coins");
		components.add("reels");
		components.add("ARM");
	}


	public void linkTo(java.util.ArrayList<Slot> otherSlots) {
		System.out.println("WG Progressive slot linked to " + otherSlots.size() + " other slots.");
	}
}
