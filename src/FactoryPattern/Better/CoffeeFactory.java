package FactoryPattern.Better;

public class CoffeeFactory {

    IngredientCreatorFactory lf;

    public Coffee getCoffee(String whichCoffee, String whichMilk, String whichSugar, String whichCoffeeType) {
        Coffee coffee;
        if(whichCoffee.equals("Espresso")) {
            coffee = new Espresso();
        } else if(whichCoffee.equals("Latte")) {
            LatterCreatorFactory latteCreator = new LatterCreatorFactory(whichMilk, whichSugar);
            coffee = new Latte(this.lf);
        } else {
            coffee = new Cappucino();
        }
        return coffee;
    }

}
