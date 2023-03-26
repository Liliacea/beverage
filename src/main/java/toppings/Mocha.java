package toppings;

import beverage.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    public Double cost() {
        return beverage.cost() + 0.45;
    }

    public String getDescription() {
        return beverage.getDescription() + " с шоколадом";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
