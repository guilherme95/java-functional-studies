package main;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        greetCustomer.accept(new Customer("John", "25111995"));
        greetCustomerV2.accept(new Customer("John", "25111995"), true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "****"));

    static Consumer<Customer> greetCustomer = customer ->
            System.out.println("Hello " + customer.name +
                    ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static class Customer {
        private final String name;
        private final String customerPhoneNumber;

        Customer(String name, String customerPhoneNumber){
            this.name = name;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
