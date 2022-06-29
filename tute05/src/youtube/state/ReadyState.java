package youtube.state;

import youtube.Viewing;

public class ReadyState extends ViewingState {
    public ReadyState(Viewing viewing) {
        super(viewing);
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