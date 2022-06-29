package youtube.state;

import youtube.Viewing;

public class LockedState extends ViewingState {
    public LockedState(Viewing viewing) {
        super(viewing);
        viewing.setPlaying(false);
    }

    @Override
    public String onLock() {
        return null;
    }

    @Override
    public String onPlay() {
        return null;
    }

    @Override
    public String onNext() {
        return null;
    }
}