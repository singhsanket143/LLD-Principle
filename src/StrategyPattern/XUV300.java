package StrategyPattern;

public class XUV300 extends Car implements PetrolEngine {
    public EngineStrategy engine;

    public XUV300(EngineStrategy strategy) {
        this.engine = strategy;
    }

    public String getPetrol() {
        return this.engine.getFuel();
    }
}
