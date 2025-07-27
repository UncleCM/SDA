public class NVSlotProgressive extends Slot {
	
	public NVSlotProgressive() {
		cost=300;
		name="Progressive";
		software = "Android";
		components.add("Large");
		components.add("Ticketinticketout");
		components.add("LCD");
		components.add("X77");
	}

	public void linkTo(java.util.ArrayList<Slot> otherSlots) {
		System.out.println("NV Progressive slot linked to " + otherSlots.size() + " other slots.");
	}
}
