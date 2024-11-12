public class Runner {
    public static void main(String[] args) {
        // Instantiate the classes
        InventoryManager inventoryManager = new InventoryManager();
        OrderProcessor orderProcessor = new OrderProcessor();

        Dimensions dimensions1 = new Dimensions(10, 5, 3);
        Dimensions dimensions2 = new Dimensions(1, 3, 2);
        Manufacturer manufacturer1 = new Manufacturer("Gadgets Inc", "123 Gadget Lane");
        Manufacturer manufacturer2 = new Manufacturer("Watches Inc", "123 Watches Lane")
        Product product1 = new Product("Gadget", dimensions1, 3.30, manufacturer1);
        Product product2 = new Product("Watch", dimensions2, 5.30, manufacturer2);
        Customer customer = new Customer("John Doe", "123 Main St", new String[]{"Order1", "Order2"}, 100);

        ReportGenerator reportGenerator = new ReportGenerator();

        LoginService loginService = new LoginService();
        User user = new User("Alice", "alice@example.com", "password123");

        // Inventory Management
        inventoryManager.manageInventory("add", "Watch", 10);
        inventoryManager.manageInventory("add", "Gadget", 50);
        inventoryManager.manageInventory("add", "Lamp", 25);

        // Order Processing
        Order order = new Order("10");
        order.addProduct(product1);
        order.addProduct(product2);
        orderProcessor.processOrder(order, customer);

        // Login Service
        loginService.login(user);
        loginService.register(user);
        loginService.resetPassword(user);

        // Report Generation
        String inventoryReport = reportGenerator.generateInventoryReport(inventoryManager);
        String salesReport = reportGenerator.generateSalesReport(orderProcessor);

        // Output reports
        System.out.println(inventoryReport);
        System.out.println(salesReport);

        // Logout
        loginService.logout(user);
    }
}

