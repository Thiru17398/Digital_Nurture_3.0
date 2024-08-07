public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(100, "Wings of Fire", "APJ Abdul Kalam");
        Book book2 = new Book(101, "Romeo and Juliet", "William Shakespeare");
        Book book3 = new Book(102,"Mein Kamph","Adolph Hitler");

        Search search = new Search();




        Book[] books1 = {book1,book2,book3};
        System.out.println(search.linearSearch(books1 , "Wings of Fire"));


        Book[] sortedBooks = {book3,book2,book1};
        System.out.println(search.binarySearch(sortedBooks, "Romeo and Juliet"));

    }
}