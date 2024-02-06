package FactoryPattern.Better;

public abstract class Coffee {

    Milk milk;
    Sugar sugar;

    IngredientCreatorFactory icf;

    abstract void boil();

    abstract void freeze();

    abstract void brew();

}
