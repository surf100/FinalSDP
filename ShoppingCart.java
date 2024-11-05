import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart instance;
    private List<Product> products;

    private ShoppingCart() {
        products = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}