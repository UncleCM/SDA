public class mediumCabinet implements Cabinet {
	public String toString() {
		return "A medium cabinet";
	}
	
	@Override
	public String getSize() {
		return "Medium";
	}
	
	@Override
	public String getDescription() {
		return "Medium cabinet for standard slot machines";
	}
} 