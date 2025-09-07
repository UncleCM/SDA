
public class TestDrive {
	public static void main(String[] args) {
		RemoteDevice remote = new RemoteDevice();

		remote.pressPlay();
		remote.pressPause();
		remote.pressStop();
		remote.pressRewind(); // Demonstrate rewind feature
		remote.pressPlay();

		// Demonstrate locking feature
		remote.pressLock();
		remote.pressPlay(); // Should do nothing
		remote.pressPause(); // Should do nothing
		remote.pressUnlock(); // Unlock and restore previous state
		remote.pressPlay(); // Should work again
	}
}
