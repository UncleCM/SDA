public class Coins implements Payment {
	public String toString() {
		return "Coin-based payment system";
	}
	
	@Override
	public String getType() {
		return "coins";
	}
	
	@Override
	public String getDescription() {
		return "Coin-based payment system";
	}
}
