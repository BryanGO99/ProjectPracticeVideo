package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println (isPhoneNumberValid("07000000000"));
        System.out.println (isPhoneNumberValid("070000000"));
        System.out.println(isPhoneNumberValid("09456987123"));

        System.out.println("With predicate");

        System.out.println(isPhoneNumberValidPredicate.test("07000000300"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09456987123"));

        System.out.println("Is the phone number valid and contains 3? "+isPhoneNumberValidPredicate.or(containsNumber3).test("09456987123"));
        System.out.println("Is the phone number valid and contains 3? "+isPhoneNumberValidPredicate.and(containsNumber3).test("07000000300"));


    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate <String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
  }
