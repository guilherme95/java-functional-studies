package combinatorpattern;

import static combinatorpattern.CustomerRegistrationValidator.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Mariam",
                "mariam@email.com",
                "+04565465465",
                LocalDate.of(2001, 12, 12)
        );

//        System.out.println(new CustomerValidatorService().isCustomerValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);


        if(!result.equals(ValidationResult.SUCCESS)){
            throw new IllegalStateException(result.name());
        }
        System.out.println(result);
    }
}
