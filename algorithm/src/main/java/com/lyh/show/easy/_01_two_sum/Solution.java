package com.lyh.show.easy._01_two_sum;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution {

    public int[] twoSum01(int[] num, int target) {
        if (num.length <= 2) {
            return null;
        }
        Arrays.sort(num);
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            if (num[i] + num[j] < target) {
                i++;
            } else if (num[i] + num[j] > target) {
                j--;
            } else {
                break;
            }
        }
        return new int[]{i, j};
    }

    public int[] twoSum02(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; ++i) {
            final Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public int[] twoSum03(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
