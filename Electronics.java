class Electronics extends Product {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }
}