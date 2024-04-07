package StrategyPattern;

public class XUV700 extends Car implements PetrolEngine{

    public EngineStrategy engine;

    public XUV700(EngineStrategy strategy) {
        this.engine = strategy;
    }

    public String getPetrol() {
        return this.engine.getFuel();
    }
}
