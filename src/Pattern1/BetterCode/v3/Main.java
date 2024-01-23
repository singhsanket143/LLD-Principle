package Pattern1.BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setBrand("Apple");
        b.setName("Iphone");
        b.setPrice(1000);

        Product p = new Product(b);
    }
}
