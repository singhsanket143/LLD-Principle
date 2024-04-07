package StrategyPattern;

public class BatteryEngineStrategy implements EngineStrategy {
    @Override
    public String getEngineType() {
        return "Battery";
    }

    @Override
    public String getFuel() {
        return "30%";
    }
}
