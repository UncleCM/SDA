/**
 * Locked.java
 *
 * This file represents the Locked state.
 */

public class Locked implements State {
    private RemoteDevice remote;

    public Locked(RemoteDevice remote) {
        this.remote = remote;
    }

    // All button presses do nothing except unlock
    public boolean pressPlay() {
        System.out.println("Remote is locked. Press unlock to use.");
        return false;
    }

    public boolean pressPause() {
        System.out.println("Remote is locked. Press unlock to use.");
        return false;
    }

    public boolean pressStop() {
        System.out.println("Remote is locked. Press unlock to use.");
        return false;
    }

    public boolean pressRewind() {
        System.out.println("Remote is locked. Press unlock to use.");
        return false;
    }

    // Unlock method
    public boolean unlock() {
        System.out.println("Remote unlocked.");
        remote.restorePreviousState();
        return true;
    }
}
