package Lesson2_OpenClosedPrinciple.TakeHomeTask;

class Product { 
    double price;
    public double getPrice() {
         return price;
    }

    public double getDiscount(){
        return 0;
    }
}

class ElectronicProduct extends Product {

    @Override 
    public double getDiscount() {
        return getPrice() * 0.10;
    }

}

class ClothingProduct extends Product {

    @Override
    public double getDiscount() {
       return getPrice() * 0.20;
    } 
}

public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}