package com.lyh.show.easy._16_diving_board;


/**
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * <p>
 * 返回的长度需要从小到大排列。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 * <p>
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 * <p>
 * 当 k == 0 时，返回 [] 即可；
 * <p>
 * 当 shorter == longer 时，返回 [k * shorter] 即可；
 * <p>
 * 当 shorter != longer 时，那么其实就是一个首项为 k * shorter，末项为 k * longer，公差为 longer - shorter 的等差数列么；
 */
public class Solution {

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) return new int[]{k * shorter};
        int[] ans = new int[k + 1];
        int delta = longer - shorter;
        int first = k * shorter;
        for (int i = 0; i <= k; i++) {
            ans[i] = first + i * delta;
        }
        return ans;
    }

}
