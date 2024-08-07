public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;



    Product(int id, String productName, int quantity, double price){
        this.productId = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}