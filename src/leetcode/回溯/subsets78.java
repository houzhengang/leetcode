package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        boolean[] used=new boolean[len];
        List<Integer> subres = new ArrayList<>();
        method(nums,used,res,subres,len);
        return res;

    }

    private static void method(int[] nums ,boolean[] used,List<List<Integer>> res,List<Integer> subres,int len) {


    }
}
