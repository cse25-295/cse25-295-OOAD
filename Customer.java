package model;

import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String firstName;
    private String surname;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Account> accounts;

    public Customer(String customerId, String firstName, String surname,
                    String address, String phone, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public void register() {
        // Customer registration will be handled by the application/controller.
    }

    public boolean login(String enteredEmail, String enteredPassword) {
        // Password authentication should be added when the login requirements are defined.
        return email != null && email.equals(enteredEmail);
    }

    public void updateDetails(String address, String phone, String email) {
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void addAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public ArrayList<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
