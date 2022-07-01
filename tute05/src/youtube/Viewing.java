package youtube;

import youtube.state.ReadyState;
import youtube.state.ViewingState;

public class Viewing {
    private Video video;
    private Video nextVideo;
    private Producer user;
    private ViewingState state = new ReadyState(this); // Default state is ready state
    private boolean playing = false;

    public Viewing(Video video, Video nextVideo, Producer user) {
        this.video = video;
        this.nextVideo = nextVideo;
        this.user = user;
    }

    public void setPlaying(boolean play) {
        this.playing = play;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void changeState(ViewingState newState) {
        this.state = newState;
    }

    public String startPlayback() {
        return "Playing video " + video.getName() + "!!!";
    }

    public String getNextVideo() {
        return nextVideo.getName();
    }

    // === Input ===

    public String lock() {
        // Method forwarding
        return this.state.onLock();
    }

    public String play() {
        return this.state.onPlay();
    }

    public String next() {
        this.video = nextVideo;
        return this.state.onNext();
    }

    public static void main(String[] args) {
        Producer producer = new Producer("Ashesh");
        Viewing view = new Viewing(new Video("Video 1", 10, producer), new Video("Video 2", 14, producer), producer);
        view.setPlaying(true);

        System.out.println(view.play());
        System.out.println(view.play());
        System.out.println(view.next());
        System.out.println(view.lock());
        System.out.println(view.play());
        System.out.println(view.next());
        System.out.println(view.play());
    }

}