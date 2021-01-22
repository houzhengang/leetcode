package leetcode.动态规划;

public class rob198 {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n ==0){
            return 0;
        }
        else if(n ==1){
            return nums[0];
        }
        else if(n == 2){
            return  Math.max(nums[1],nums[0]);
        }else {
            nums[1] = Math.max(nums[1],nums[0]);
            for (int i = 2; i < n; i++) {
                nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
            }
            return nums[n-1];
        }
    }
}
