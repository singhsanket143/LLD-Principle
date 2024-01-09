package Lesson5_InterfaceSegregationPrinciple.ProblematicCode;

public class Buyer implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProduct() {

    }
}
