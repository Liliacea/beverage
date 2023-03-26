package beverage;

import beverage.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "house blend";
    }

    public Double cost() {
        return 2.00;
    }
}
