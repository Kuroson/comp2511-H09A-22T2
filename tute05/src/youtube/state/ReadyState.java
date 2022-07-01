package youtube.state;

import youtube.Viewing;

public class ReadyState extends ViewingState {
    public ReadyState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        // Changes it to locked
        this.getViewing().changeState(new LockedState(this.getViewing()));
        return "Locked";
    }

    @Override
    public String onPlay() {
        String action = this.getViewing().startPlayback();
        this.getViewing().changeState(new PlayingState(getViewing()));
        return action;
    }

    @Override
    public String onNext() {
        return "Error: Locked.";
    }
}