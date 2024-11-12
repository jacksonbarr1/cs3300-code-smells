public class Customer {
    private String name;
    private String address;
    private String[] orderHistory;

    private int income;

    public Customer(String name, String address, String[] orderHistory, int income) {
        this.name = name;
        this.address = address;
        this.orderHistory = orderHistory;
        this.income = income;
    }

    public boolean validateOrder(Order order) {
        if (this.income > order.getTotalCost()) return true;
        return false;
    }

    public void processPayment(Order order) {
        this.income = ((int) (this.income - order.getTotalCost()));
    }

    public int getIncome() {return income;}

    public void setIncome(int income) {this.income = income;}

    public String getName() { return name;}
}
