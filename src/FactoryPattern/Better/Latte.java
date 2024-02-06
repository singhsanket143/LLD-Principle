package FactoryPattern.Better;

public class Latte extends Coffee {

    Latte(IngredientCreatorFactory icf) {
        this.icf = icf;
    }
    @Override
    public void boil() {

    }

    @Override
    public void freeze() {

    }

    @Override
    public void brew() {

    }
}
