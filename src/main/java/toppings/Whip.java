package toppings;

import beverage.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public Double cost() {
        return beverage.cost() + 0.15;
    }

    public String getDescription() {
        return beverage.getDescription() + " со взбитыми сливками";
    }

    @Override
    public Size getSize() {
        return null;
    }
}
