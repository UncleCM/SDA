public class NJSlotProgressive extends Slot {
	public NJSlotProgressive() {
		name="Progressive";
		software = "Android";
		components.add("Small");
		components.add("coins");
		components.add("CRT");
		components.add("X77");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}

	public void linkTo(java.util.ArrayList<Slot> otherSlots) {
		System.out.println("NJ Progressive slot linked to " + otherSlots.size() + " other slots.");
	}
}
