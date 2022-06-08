package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private List<GenericSatellite> satellites = new ArrayList<>();

    public void addSatellite(GenericSatellite satelliteToAdd) {
        this.satellites.add(satelliteToAdd);
    }

    public List<GenericSatellite> getSatelliteList() {
        return this.satellites;
    }

    public static void main(String[] args) {
        // Why do I not need a defined constructor when I have an attribute
        Controller c = new Controller();
        c.addSatellite(new FastSatellite("Fast Satellite 1"));
        c.addSatellite(new FastSatellite("Fast Satellite 2"));
        c.addSatellite(new SlowSatellite("Slow Satellite 1"));

        List<GenericSatellite> allSatellites = c.getSatelliteList();
        System.out.println("All: " + allSatellites);
        // [{name='Fast Satellite 1'}, {name='Fast Satellite 2'}, {name='Slow Satellite 1'}]

        // What if I just want FastSatellites only?
        // Method 1, normal for-in/for-each
        List<GenericSatellite> fast1 = new ArrayList<>();
        for (GenericSatellite x : allSatellites) {
            if (x instanceof FastSatellite) {
                fast1.add(x);
            }
        }
        System.out.println("Just fast: " + fast1);
        // [{name='Fast Satellite 1'}, {name='Fast Satellite 2'}]

        // Method 2, streams
        List<GenericSatellite> fast2 = allSatellites.stream().filter(x -> x instanceof FastSatellite).collect(Collectors.toList());
        System.out.println("Just fast: " + fast2);
        // [{name='Fast Satellite 1'}, {name='Fast Satellite 2'}]

        // Same, but I typecast at the same time
        List<FastSatellite> fast3 = allSatellites.stream().filter(x -> x instanceof FastSatellite).map(x -> (FastSatellite) x)
                .collect(Collectors.toList());
        System.out.println("Just fast: " + fast3);
        // [{name='Fast Satellite 1'}, {name='Fast Satellite 2'}]

        // What if im trying to search for something?
        // Look for satellite with name == "Fast Satellite 2"
        // Method 1, normal for-in/for-each
        GenericSatellite g1 = null;

        for (GenericSatellite x : allSatellites) {
            if (x.getName().equals("Fast Satellite 2")) {
                g1 = x;
                break;
            }
        }
        System.out.println(g1);
        // {name='Fast Satellite 2'}

        // Method 2, streams
        GenericSatellite g2 = allSatellites.stream().filter(x -> x.getName().equals("Fast Satellite 2")).findFirst().orElse(null);
        System.out.println(g2);
        // {name='Fast Satellite 2'}

        // Now I search for "Fast Satellite 3", which doesn't exist
        GenericSatellite g3 = allSatellites.stream().filter(x -> x.getName().equals("Fast Satellite 3")).findFirst().orElse(null);
        System.out.println(g3);
        // null
    }
}