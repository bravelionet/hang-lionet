package com.lyh.show.easy._35_search_insert_position;

/**
 * Description
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 * Tags: Array, Binary Search
 */
public class Solution {

    public static int searchInsertPosition(int[] arr, int targetNum) {
        if (arr.length == 0) return -1;

        return binarySearch(arr, 0, arr.length - 1, targetNum);
    }

    private static int binarySearch(int[] arr, int l, int r, int targetNum) {
        int mid = (l + r) / 2;
        if (l > r) {
            return l;
        }
        if (arr[mid] > targetNum) {
            return binarySearch(arr, l, mid - 1, targetNum);
        } else {
            return binarySearch(arr, mid + 1, r, targetNum);
        }
    }

    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 7}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = (right + left) >> 1;
        while (left <= right) {
            if (target <= nums[mid]) right = mid - 1;
            else left = mid + 1;
            mid = (right + left) >> 1;
        }
        return left;
    }
}
