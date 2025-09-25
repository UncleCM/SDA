public class Bills implements Payment {
	public String toString() {
		return "Bill-based payment system";
	}
	
	@Override
	public String getType() {
		return "bills";
	}
	
	@Override
	public String getDescription() {
		return "Bill-based payment system";
	}
}
