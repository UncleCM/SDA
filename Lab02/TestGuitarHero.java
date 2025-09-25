
public class TestGuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GameCharacter player1 = new GameCharacterSlash();
			GameCharacter player2 = new GameCharacterHendrix();
			GameCharacter player3 = new GameCharacterAngus();

			System.out.println("--- Slash ---");
			player1.playGuitar();
			player1.playSolo();

			System.out.println("--- Hendrix ---");
			player2.playGuitar();
			player2.playSolo();

			System.out.println("--- Angus Young ---");
			player3.playGuitar();
			player3.playSolo();

			// Demonstrate changing guitar and solo at runtime
			System.out.println("\n--- Slash changes guitar and solo ---");
			player1.setGuitar(new Guitar_LesPaul());
			player1.setSolo(new Solo_SmashGuitar());
			player1.playGuitar();
			player1.playSolo();
	}
}

