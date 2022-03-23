package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Mariam",
                "mariam@email.com",
                "+04565465465",
                LocalDate.of(2001,12,12)
        );

        System.out.println(new CustomerValidatorService().isCustomerValid(customer));
    }
}
