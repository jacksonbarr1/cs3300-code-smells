import java.util.HashMap;

public class OrderProcessor {

    private HashMap<Order, Customer> orders;

    public OrderProcessor() {
        this.orders = new HashMap<>();
    }
    public void processOrder(Order order, Customer customer) {
        if (customer.validateOrder(order)) {
            customer.processPayment(order);
            addToOrders(order, customer);
        }
    }

    private void addToOrders(Order order, Customer customer) {
        orders.put(order, customer);
    }

    public HashMap<Order,Customer> getOrders() { return orders;}
}
