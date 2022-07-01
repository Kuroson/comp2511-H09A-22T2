package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

/**
 * Holiday - 15% surcharge on all items for all customers
 */
public class HolidayStrategy implements ChargingStrategy {
    private final double STANDARD_RATE = 1.15;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double standardChargeModifier() {
        return STANDARD_RATE;
    }

}