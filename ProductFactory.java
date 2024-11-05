class ProductFactory {
    public static Product createProduct(String type, String id, String name, double price) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics(id, name, price);
            case "clothing":
                return new Clothing(id, name, price);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}