import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(100,"Vikram",3000.0);
        Order order2 = new Order(101,"Isma",1200.0);
        Order order3 = new Order(102,"Rubi",5000.0);
        Order order4 = new Order(103,"Lokesh",1500);


        Order[] orders1 = {order1,order2,order3,order4};

        Order[] orders2 = Arrays.copyOf(orders1,orders1.length);

        Sort sort = new Sort();

        System.out.println("Before Sorting");
        printOrders(orders1);

        sort.quickSort(orders1,0,orders1.length - 1);

        System.out.println("After Bubble Sorting");
        printOrders(orders1);

        System.out.println("Before Sorting");
        printOrders(orders2);

        sort.quickSort(orders2,0,orders2.length - 1);

        System.out.println("After Quick Sorting");
        printOrders(orders2);

    }

    public static void printOrders(Order[] orders){
        System.out.printf("%-20s %-20s %s\n","Order Id","Customer Name","Amount");
        for(Order order : orders){
            System.out.printf("%-20s %-20s %s\n",order.getId(),order.getName(),order.getTotalPrice());
        }
    }
}