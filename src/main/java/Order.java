import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import toppings.Milk;
import toppings.Mocha;
import toppings.Soy;

public class Order {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage1 = new HouseBlend();

        beverage1 = new Soy(beverage1);
        beverage1.setSize(Beverage.Size.SMALL);


        System.out.printf(beverage1.getDescription() + " " + "%.2f",beverage1.cost());
        System.out.println();





    }
}
