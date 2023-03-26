package toppings;

import beverage.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public Double cost() {
        return beverage.cost() + 0.20;
    }

    public String getDescription() {
        return beverage.getDescription() + "с молоком";
    }

    @Override
    public Size getSize() {
        return null;
    }
}
