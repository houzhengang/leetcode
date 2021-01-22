package leetcode.动态规划;

public class maxsublist53 {
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int pre=0;

        for(int i=0;i<nums.length;i++){

                pre = Math.max(pre + nums[i], nums[i]);
                max = Math.max(max, pre);

        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
    }
}
