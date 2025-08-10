public class largeCabinet implements Cabinet {
	public String toString() {
		return "A large cabinet";
	}
	
	@Override
	public String getSize() {
		return "Large";
	}
	
	@Override
	public String getDescription() {
		return "Large cabinet for premium slot machines";
	}
}