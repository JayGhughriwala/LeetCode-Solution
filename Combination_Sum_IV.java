class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] Dp = new int[target+1];
        Dp[0] = 1;
        for(int i=0;i<=target;i++)
            for(int num : nums)
                if(num<=i)
                    Dp[i]+=Dp[i-num];
        return Dp[target];
    }
}