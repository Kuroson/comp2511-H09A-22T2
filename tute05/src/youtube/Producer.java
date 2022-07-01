package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject/Observable
 */
public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<>();
    private List<User> subscribers = new ArrayList<>(); // observables

    public Producer(String name) {
        this.name = name;
    }

    // Add observer
    public void addSubscriber(User u) {
        this.subscribers.add(u);
    }

    // Remove observer
    public void removeSubscriber(User u) {
        this.subscribers.remove(u);
    }

    // Change state => Update all observers
    public void postVideo(String name, int length) {
        Video video = new Video(name, length, this);
        this.videos.add(video);

        // Notify our subscribers (observers) that a new video has been
        // posted
        this.subscribers.stream().forEach(x -> x.alertNewVideo(video));
    }

    public static void main(String[] args) {
        Producer p = new Producer("Anthony");
        User u = new User("Raymond");
        u.subscribeTo(p);
        p.postVideo("SomeVideoName", 10); // Should notify `u`
        User u2 = new User("Zhitao");
        u2.subscribeTo(p);
        // p.removeSubscriber(u); // Unsubscribes u
        p.postVideo("Observer Pattern", 100); // Should notify `u`
    }
}
