package algorithm;

import java.util.Arrays;

public class leetcode53 {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], dp[i]);
        }

        return Arrays.stream(dp).max().orElse(0);

    }

    public static void main(String[] args) {
        int[] nums = {-2, 1};
        leetcode53 lc = new leetcode53();
        System.out.print(lc.maxSubArray(nums));
    }

}