public class Main {
    public static void main(String[] args) {

        Search search = new Search();

        Product[] productsArray = new Product[3];

        productsArray[0] = new Product(101,"Poco X3","Mobile");
        productsArray[1] = new Product(102,"Lenovo Thinkbook 15","Laptop");
        productsArray[2] = new Product(100,"Mi Wired Earphones","Earphones");

        Product[] sortedProductsArray = new Product[3];

        sortedProductsArray[0] = new Product(100,"Poco X3","Mobile");
        sortedProductsArray[1] = new Product(101,"Lenovo Thinkbook 15","Laptop");
        sortedProductsArray[2] = new Product(102,"Mi Wired Earphones","Earphones");

        System.out.println("Search Using Linear Search");
        System.out.println(search.linearSearch(productsArray,101));

        System.out.println("Search Using Binary Search");
        System.out.println(search.binarySearch(sortedProductsArray,102));

    }
}