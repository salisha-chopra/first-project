import java.util.*;
public class EmailValidation {
    public static void main(String[] args) {
        System.out.println(isValidEmail("a@b.e"));  // true
        System.out.println(isValidEmail("abcde.edcba@a.b.c.d.e"));  // true

        // Invalid emails
        System.out.println(isValidEmail("@a.a"));  // false
        System.out.println(isValidEmail("a@a"));  // false
        System.out.println(isValidEmail("a.b@c.d@e.e"));  // false
        System.out.println(isValidEmail("aa..aa@a.a"));  // false
        System.out.println(isValidEmail("abc@d.e.f"));  // false
        System.out.println(isValidEmail("abc.@a.a"));  // false
        System.out.println(isValidEmail("abc@a.a."));  // false
        System.out.println(isValidEmail("abc@a.a"));  // true
        System.out.println(isValidEmail("abc@abcde.edcba"));  // true
        System.out.println(isValidEmail("a@b.c.d.e.f"));  // false
        System.out.println(isValidEmail("abc@..a"));  // false
        System.out.println(isValidEmail("abc@abc.."));  // false
        System.out.println(isValidEmail("abc@abc."));  // false
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("not a valid email string");
            return false;
        }
        int atCount = 0;
        int dotCount = 0;
        int atIndex = 0;
        char[] emailCharArray = email.toCharArray();
        for (int i = 0; i < emailCharArray.length; i++) {
            if (i == 0 || i == emailCharArray.length - 1) {
                if (emailCharArray[i] == '@' || emailCharArray[i] == '.') {
                    return false;
                }
            }
            if (emailCharArray[i] == '@') {

                if (emailCharArray[i - 1] == '.' || emailCharArray[i + 1] == '.') {
                    return false;
                }
                atCount += 1;
                if (atCount == 1) {
                    atIndex = i;
                    continue;
                }return false;


            }
            if (emailCharArray[i] == '.') {
                if (emailCharArray[i-1] == '.' || emailCharArray[i+1] == '.') {
                    return false;
                }
                dotCount++;
            }
            if (!(emailCharArray[i] >= 'a' && emailCharArray[i] <= 'e') &&
                    emailCharArray[i] != '@' && emailCharArray[i] != '.' ) {
                return false;
            }
        }
        return atCount == 1 && dotCount >= 1;
    }
}
