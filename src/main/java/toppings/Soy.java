package toppings;

import beverage.Beverage;


public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Double cost() {
        double cost = beverage.cost();
        if (this.beverage.getSize() == Size.TALL) {
            cost += 0.50;
        }else if (this.beverage.getSize() == Size.SMALL){
            cost += 0.20;
        } else {
            cost += 0.30;
        }

        return cost;
    }

    public String getDescription() {
        return beverage.getDescription() + " с соевым молоком";
    }


}
