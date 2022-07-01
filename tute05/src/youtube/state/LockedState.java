package youtube.state;

import youtube.Viewing;

public class LockedState extends ViewingState {
    public LockedState(Viewing viewing) {
        super(viewing);
        viewing.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (this.getViewing().isPlaying()) {
            // switch to ready state
            this.getViewing().changeState(new ReadyState(this.getViewing()));
            return "playing";
        } else {
            // switch to locked
            this.getViewing().changeState(new LockedState(this.getViewing()));
            return "Locked";
        }
    }

    @Override
    public String onPlay() {
        this.getViewing().changeState(new ReadyState(this.getViewing()));
        return "Playing";
    }

    @Override
    public String onNext() {
        return "Error: Locked";
    }
}