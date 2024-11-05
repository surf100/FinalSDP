public class Checkout {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double finalizePrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}