import java.util.HashMap;
import java.util.Map;

public class Inventory {
    HashMap<String,Product> products;


    Inventory(){
        products = new HashMap<>();
    }

    void addProduct(Product product){
        this.products.put(product.getProductName().toLowerCase() , product);
    }

    void removeProduct(Product product){
        this.products.remove(product.getProductName().toLowerCase());
    }

    void updateProduct(Product product,double price){
        product.setPrice(price);
    }

    void displayProducts(){
        System.out.println("Number of Products in Inventory : " + products.size());
        System.out.printf("%-20s %-20s %s\n","Product Name","Quantity","Price");
        for(Map.Entry<String,Product> product : products.entrySet()){
            Product currentProduct = product.getValue();
            System.out.printf("%-20s %-20s %s\n",currentProduct.getProductName(),currentProduct.getQuantity(),currentProduct.getPrice());

        }
    }
}
