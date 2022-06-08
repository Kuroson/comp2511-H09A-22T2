package stream;

public class SlowSatellite extends GenericSatellite {
    private static final double speed = 50.0;

    public SlowSatellite(String name) {
        super(SlowSatellite.speed, name);
    }
}
