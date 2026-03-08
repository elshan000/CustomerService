package org.example.Strategy;

import org.example.Customer;
import org.example.CustomerInfo;

public class CreateCustomer {

    public static void createCustomer(Customer customer) {
        CustomerInfo.customers[CustomerInfo.customerCount++] = customer;
    }
}
