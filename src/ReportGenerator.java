import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    public String generateInventoryReport(InventoryManager inventoryManager) {
        Map<String, Integer> inventory = inventoryManager.getInventory();
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            report.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return report.toString();
    }

    public String generateSalesReport(OrderProcessor processor) {
        HashMap<Order, Customer> orders = processor.getOrders();
        StringBuilder report = createReport(orders);

        return report.toString();
    }

    private StringBuilder createReport(HashMap<Order, Customer> orders) {
        StringBuilder report = new StringBuilder("Sales Report:\n");
        for (Map.Entry<Order, Customer> entry : orders.entrySet()) {
            Order order = entry.getKey();
            Customer customer = entry.getValue();
            report.append("Customer: ").append(customer.getName())
                    .append("\nOrder ID: ").append(order.getId())
                    .append("\nTotal Cost: $").append(order.getTotalCost())
                    .append("\nStatus: ").append(order.getStatus())
                    .append("\nProducts:\n");

            // Print each product in the order
            for (Product product : order.getProducts()) {
                report.append(" - ").append(product.getName())
                        .append(": $").append(product.getPrice()).append("\n");
            }

            report.append("\n"); // Separate entries for readability
        }
        return report;
    }

    public String generateCustomerOrderHistoryReport(Customer customer) {
        StringBuilder report = new StringBuilder("Order History for Customer: " + customer.getName() + "\n");
        report.append("Address: ").append(customer.getAddress()).append("\n");
        report.append("Income: $").append(customer.getIncome()).append("\n\n");

        for (Order order : customer.getOrderHistory()) {
            report.append("Order ID: ").append(order.getId())
                    .append("\nTotal Cost: $").append(order.getTotalCost())
                    .append("\nStatus: ").append(order.getStatus())
                    .append("\nProducts:\n");

            for (Product product : order.getProducts()) {
                report.append(" - ").append(product.getName())
                        .append(": $").append(product.getPrice()).append("\n");
            }

            report.append("\n"); // Separate orders for readability
        }

        return report.toString();
    }
}
