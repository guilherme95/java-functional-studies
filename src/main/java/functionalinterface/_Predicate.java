package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.test("55984098315"));
        System.out.println(isPhoneNumberValid.and(containsNine).test("55984098315"));
        System.out.println(isMale.test("Male", 19));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("55") && phoneNumber.length() == 11;

    static Predicate<String> containsNine = phoneNumber ->
            phoneNumber.contains("9");

    static BiPredicate<String, Integer> isMale = (gender, age) ->
            gender.equalsIgnoreCase("male") && age >= 18;
}
