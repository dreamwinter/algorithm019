/**
 * @author libingc
 * @date 2020/12/01
 * https://leetcode-cn.com/problems/jump-game/
 */

public class jumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len <= 1) return true;

        //dp[i] 代表从nums[0...i-1]一路跳过来，是否能到达
        boolean[] dp = new boolean[len];

        //base case
        dp[0] = true;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && j + nums[j] >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len - 1];

    }
}
