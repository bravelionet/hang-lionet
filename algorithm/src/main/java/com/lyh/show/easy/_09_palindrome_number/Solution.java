package com.lyh.show.easy._09_palindrome_number;


/**
 * Description
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 题意是判断一个有符号整型数是否是回文，
 * 也就是逆序过来的整数和原整数相同，首先负数肯定不是，
 * 接下来我们分析一下最普通的解法，就是直接算出他的回文数，然后和给定值比较即可。
 */
public class Solution {

    public boolean isPalindromeNumber(int num) {
        if (num < 0) {
            return false;
        }
        int y = num, reverse = 0;
        while (y > 0) {
            reverse = reverse * 10 + y % 10;
            y /= 10;
        }
        return num == reverse;
    }

    public static boolean isPalindromeNumber02(int num) {
        if (num < 0) return false;

        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber02(121));
    }
}
