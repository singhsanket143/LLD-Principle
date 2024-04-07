package StrategyPattern;

public class PetrolEngineStrategy implements EngineStrategy{
    @Override
    public String getEngineType() {
        return "Petrol";
    }

    @Override
    public String getFuel() {
        return "30L";
    }
}
