import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product rice = new Product(100,"Rice",1,75.0);
        Product salt = new Product(101,"Salt",1,24.0);
        Product sugar = new Product(102,"Sugar",1,40.0);

        inventory.addProduct(rice);
        inventory.addProduct(salt);
        inventory.addProduct(sugar);

        System.out.println("Before Deleting a Product");
        inventory.displayProducts();

        inventory.removeProduct(salt);

        System.out.println("After deleting a Product");
        inventory.displayProducts();


        inventory.updateProduct(sugar , 38.0);


        System.out.println("After updating a Product");
        inventory.displayProducts();
    }
}