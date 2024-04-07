package StrategyPattern;

public class XUV400 extends Car implements BatteryEngine{
    public EngineStrategy engine;

    public XUV400(EngineStrategy strategy) {
        this.engine = strategy;
    }

    public String getBattery() {
        return this.engine.getFuel();
    }
}
