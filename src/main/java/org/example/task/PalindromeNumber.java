package org.example.task;

public class PalindromeNumber {

    /*
        Palindrome Number

        Given an integer x, return true if x is a palindrome, and false otherwise.

     */

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int reversed = 0;

        while (temp > 0) {
            int dig = temp % 10;
            reversed = reversed * 10 + dig;
            temp /= 10;
        }

        return reversed == x;
    }

    public boolean isPalindrome1(int x) {
        String strNumber = String.valueOf(x);
        StringBuilder builder = new StringBuilder(strNumber);

        return strNumber.equals(builder.reverse().toString());
    }

        /*
        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
                Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome1(121));
        System.out.println(palindromeNumber.isPalindrome1(-121));
    }


}
