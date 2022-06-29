package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

/**
 * Standard - normal rates
 */
public class StandardStrategy implements ChargingStrategy {
    private final double STANDARD_RATE = 1;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0.0;
    }

    @Override
    public double standardChargeModifier() {
        return STANDARD_RATE;
    }
}