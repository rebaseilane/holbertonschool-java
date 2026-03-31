import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            return false;
        }

        customers.add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);

        if (customer == null) {
            return false;
        }

        customer.addTransaction(amount);
        return true;
    }
}
