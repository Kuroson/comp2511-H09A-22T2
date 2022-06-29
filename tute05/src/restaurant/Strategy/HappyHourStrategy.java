package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

/**
 * Happy Hour - where registered members get a 40% discount, while standard customers get 30%
 */
public class HappyHourStrategy implements ChargingStrategy {
    private final double STANDARD_RATE = 0.7;
    private final double MEMBER_RATE = 0.6;

    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return 0.0;
    }

    @Override
    public double standardChargeModifier() {
        return STANDARD_RATE;
    }
}