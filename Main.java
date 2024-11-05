public class Main {
    public static void main(String[] args) {
        // Create products
        Product electronics = ProductFactory.createProduct("electronics", "1", "Smartphone", 699.99);
        Product clothing = ProductFactory.createProduct("clothing", "2", "T-Shirt", 19.99);

        // Add products to the shopping cart
        ShoppingCart cart = ShoppingCart.getInstance();
        cart.addProduct(electronics);
        cart.addProduct(clothing);

        // Calculate total
        double total = cart.calculateTotal();
        System.out.println("Total before discount: $" + total);

        // Set discount strategy
        Checkout checkout = new Checkout();
        checkout.setDiscountStrategy(new SeasonalDiscount()); // You can change to LoyaltyDiscount to test other discounts

        // Apply discount
        double discountedPrice = checkout.finalizePrice(total);
        System.out.println("Total after discount: $" + discountedPrice);

        // Initialize PayPal service
        PayPalService payPalService = new PayPalService("yourApiKey", "yourApiSecret");
        PaymentProcessor paymentProcessor = new PayPalAdapter(payPalService);

        // Process payment
        paymentProcessor.processPayment(discountedPrice);
    }
}