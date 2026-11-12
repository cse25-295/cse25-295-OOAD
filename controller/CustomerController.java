package controller;

import java.util.ArrayList;
import model.Customer;

public class CustomerController {
    private ArrayList<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<>();
    }

    public void registerCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be empty.");
        }

        customers.add(customer);
        customer.register();
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }

        return null;
    }

    public void updateCustomer(String customerId, String address,
                               String phone, String email) {
        Customer customer = findCustomer(customerId);

        if (customer == null) {
            throw new IllegalArgumentException("Customer was not found.");
        }

        customer.updateDetails(address, phone, email);
    }

    public ArrayList<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }
}
