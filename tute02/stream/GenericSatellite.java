package stream;

public abstract class GenericSatellite {
    private double linearSpeed; // in KM/minute
    private String name; // name of satellite

    public GenericSatellite(double linearSpeed, String name) {
        this.linearSpeed = linearSpeed;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getLinearSpeed() {
        return this.linearSpeed;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + "'" +
                "}";
    }

}
