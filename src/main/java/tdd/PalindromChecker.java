package tdd;


public class PalindromChecker {

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return Boolean.FALSE;
        }
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString().equals(text);
    }

    /*
    public static boolean isPalindrome(String text) {
        if (text.length() == 0) {
            return true;
        } else {
            char firstChar = text.charAt(0);
            char lastChar = text.charAt(text.length() - 1);
            String mid = text.substring(1, text.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }*/
}
