package combinatorpattern;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com",
                "+06589658456",
                LocalDate.of(2000,1,1));

       // System.out.println( new CustomerValidatorSErvice().isValid(customer));

        //if valid we can store customer on db

        //using combinator patter
       CustomerRegistrationValidator.ValidationResult result= CustomerRegistrationValidator
                .isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS) {

            throw new IllegalStateException(result.name());
        }
    }
}
