package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tdd.PalindromChecker.isPalindrome;


public class PalindromCheckerTest {

    @Test
    public void A_text_with_valid_palindrome_should_work() {
        String text = "anna";
        boolean isPalindrome = isPalindrome("anna");
        assertTrue(isPalindrome, "Given text should be a palindrome.");
    }

    // Ein Text der kein Palindrom ist soll abgelehnt werden
    @Test
    public void A_text_with_a_invalid_palidrome_should_be_rejected() {
    //    String text = "keinpalindrom";
    //    boolean isPalindrome = isPalindrome(text);
    //    assertFalse(isPalindrome, "Given text should not be a palindrome.");
    }

    // Test mit führende Leerzeichen ist kein Palindrom
    @Test
    public void A_text_with_a_leading_space_should_be_rejected() {
    }

    // Ein null-Objekt ist kein Palindrom
    @Test
    public void A_text_with_a_null_value_should_be_rejected() {
    }

    // Groß- und Kleinschreibung soll ignoriert werden (z.B. "ANna")
    @Test
    public void A_text_with_with_upper_or_lower_case_should_be_rejected() {
    }
}
