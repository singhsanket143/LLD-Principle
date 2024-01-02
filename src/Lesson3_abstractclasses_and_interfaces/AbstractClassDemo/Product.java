package Lesson3_abstractclasses_and_interfaces.AbstractClassDemo;

public abstract class Product {

    // An abstract method
    public abstract double calculateDiscount();

    // concrete method
    public void termsAndCondition() {
        System.out.println("Some terms");
    }

}
