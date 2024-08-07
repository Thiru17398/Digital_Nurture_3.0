public class Order {
    private int id;
    private String customerName;
    private double totalPrice;

    static{
        System.out.println("in static");
    }

    public Order(int id, String name, double totalPrice) {
        this.id = id;
        this.customerName = name;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        this.customerName = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        return this.id + " " + this.customerName + " " + this.totalPrice;
    }
}
