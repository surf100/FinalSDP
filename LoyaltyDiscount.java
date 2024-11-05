
public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% discount
    }
}