class Clothing extends Product {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }
}