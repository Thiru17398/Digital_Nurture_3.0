import java.util.ArrayList;

public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product( int productId, String productName, String category) {
        this.productName = productName;
        this.productId = productId;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String toString(){
        return this.productId + " " + this.productName + " " + this.category;
    }
}
