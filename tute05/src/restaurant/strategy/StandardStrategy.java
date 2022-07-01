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
        // order is list of something
        // 1. Convert it to a stream
        // 2. Using stream, we map (Meal) -> double
        // 3. Sum over the stream
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double standardChargeModifier() {
        return STANDARD_RATE;
    }
}