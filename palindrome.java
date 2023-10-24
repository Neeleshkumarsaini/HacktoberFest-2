public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        return isPalindromeRecursive(numStr, 0, numStr.length() - 1);
    }

    private static boolean isPalindromeRecursive(String numStr, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (numStr.charAt(start) != numStr.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(numStr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int number = 12321; // Change this to the number you want to check for palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
