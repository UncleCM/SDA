
import java.util.ArrayList;

public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WGStore = new WGSlotStore();
		Slot slot = NVStore.orderSlot(slottype.bonus);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
		slot = NJStore.orderSlot(slottype.bonus);
		System.out.println("Borgata ordered a "+ slot.getName());
		slot = WGStore.orderSlot(slottype.bonus);
		System.out.println("Wynn ordered a "+ slot.getName());

		// Test NV Progressive linking
		NVSlotProgressive nv1 = new NVSlotProgressive();
		NVSlotProgressive nv2 = new NVSlotProgressive();
		NVSlotProgressive nv3 = new NVSlotProgressive();
		ArrayList<Slot> nvGroup = new ArrayList<>();
		nvGroup.add(nv2);
		nvGroup.add(nv3);
		nv1.linkTo(nvGroup);

		// Test NJ Progressive linking
		NJSlotProgressive nj1 = new NJSlotProgressive();
		ArrayList<Slot> njGroup = new ArrayList<>();
		njGroup.add(new NJSlotProgressive());
		nj1.linkTo(njGroup);

		// Test WG Progressive linking
		WGSlotProgressive wg1 = new WGSlotProgressive();
		ArrayList<Slot> wgGroup = new ArrayList<>();
		wgGroup.add(new WGSlotProgressive());
		wg1.linkTo(wgGroup);
	}

}
