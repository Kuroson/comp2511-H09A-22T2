package wondrous;

import java.util.ArrayList;
import java.util.List;

// If the current term is even, the next term is half the current term.
// If the current term is odd, the next term is three times the current term, plus 1.
public class Wondrous {
    public List<Integer> wondrous(int start) {
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        if (start < 1) {
            throw new IllegalArgumentException("bad argument, must be < 1");
        }

        // current == 1
        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }
        sequence.add(1);
        return sequence;
    }
}