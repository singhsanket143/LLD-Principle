package FactoryPattern.Better;

public class LatterCreatorFactory implements IngredientCreatorFactory{

    String milk;
    String sugar;

    LatterCreatorFactory(String milk, String sugar) {
        this.milk = milk;
        this.sugar = sugar;
    }

    @Override
    public String getMilk() {
        return this.milk;
    }

    @Override
    public String getSugar() {
        return this.sugar;
    }
}
