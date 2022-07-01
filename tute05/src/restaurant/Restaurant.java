package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.HolidayStrategy;
import restaurant.strategy.StandardStrategy;

public class Restaurant {
    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();

    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("tute05/src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void setChargingStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public double cost(List<Meal> order, String payee) {
        // Method forwarding
        return this.chargingStrategy.cost(order, this.members.contains(payee));
    }

    public void displayMenu() {
        double modifier = this.chargingStrategy.standardChargeModifier();

        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        // Standard by default
        r.displayMenu();
        r.setChargingStrategy(new HolidayStrategy());
        System.out.println();
        r.displayMenu();
    }
}