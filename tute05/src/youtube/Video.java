package youtube;

public class Video {
    private String name;
    private int length;
    private Producer producer;

    public Video(String name, int length, Producer producer) {
        this.name = name;
        this.length = length;
        this.producer = producer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Producer getProducer() {
        return this.producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

}
