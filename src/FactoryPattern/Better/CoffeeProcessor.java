package FactoryPattern.Better;

public class CoffeeProcessor {

    public Coffee prepareCoffee(String whichCoffee) {
        Coffee coffee = new CoffeeFactory().getCoffee(whichCoffee, "oatmilk", "", "");

        return coffee;
    }

}
