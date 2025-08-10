public class LCD implements Display {
	public String toString() {
		return "New School LCD";
	}
	
	@Override
	public String getType() {
		return "LCD";
	}
	
	@Override
	public String getDescription() {
		return "Liquid crystal display";
	}
}
