/**
 * Rewind.java
 *
 * This file represents the Rewind state.
 */

public class Rewind implements State {
    private RemoteDevice remote;

    public Rewind(RemoteDevice remote) {
        this.remote = remote;
    }

    // Only allow transition to Rewind from Stopped
    public boolean pressRewind() {
        System.out.println("The media is rewound to the beginning.");
        remote.setPosition(0);
        // Automatically transition to Stopped
        remote.setState(remote.getStoppedState());
        return true;
    }

    public boolean pressPlay() {
        System.out.println("Cannot play while rewinding. Please wait.");
        return false;
    }

    public boolean pressPause() {
        System.out.println("Cannot pause while rewinding. Please wait.");
        return false;
    }

    public boolean pressStop() {
        System.out.println("Cannot stop while rewinding. Please wait.");
        return false;
    }
}
