package Lesson3_abstractclasses_and_interfaces.AbstractClassDemo;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndCondition() {
        System.out.println("Terms of macbook");
    }
}
