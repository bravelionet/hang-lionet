package com.lyh.show.easy._28_implement_str;

public class Solution {


    public static int implementStr(String s1, String s2) {
        if (s2.length() == 0) return -1;
        int i = 0, j = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                if (j == s2.length() - 1) {
                    return i - s2.length() + 1;
                }
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(implementStr("d234d8", "4d8"));
    }
}
