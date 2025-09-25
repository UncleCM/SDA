public class VGA implements Display {
	public String toString() {
		return "Old School VGA";
	}
	
	@Override
	public String getType() {
		return "VGA";
	}
	
	@Override
	public String getDescription() {
		return "VGA display system";
	}
}
