public class smallCabinet implements Cabinet {
	public String toString() {
		return "A small cabinet";
	}
	
	@Override
	public String getSize() {
		return "Small";
	}
	
	@Override
	public String getDescription() {
		return "Small cabinet for compact slot machines";
	}
}
