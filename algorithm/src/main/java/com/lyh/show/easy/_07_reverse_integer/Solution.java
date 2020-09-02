package com.lyh.show.easy._07_reverse_integer;

/**
 * Description
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output:  321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 */
public class Solution {

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int)result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
