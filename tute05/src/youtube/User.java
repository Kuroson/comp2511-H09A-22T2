package youtube;

/**
 * Subscriber/Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void subscribeTo(Producer p) {
        p.addSubscriber(this);
    }

    // New change state, do something with it
    public void alertNewVideo(Video video) {
        System.out.println(String.format("%s: New video %s", this.getName(), video.getName()));
    }
}
