package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class subsets78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int idx =0;
        if(nums.length==0){
            return res;
        }

        List<Integer> subres = new ArrayList<>();
        method(nums,res,subres,idx);
        System.out.println(res);
        return res;

    }

    private static void method(int[] nums ,List<List<Integer>> res,List<Integer> subres,int idx) {

        res.add(new ArrayList<>(subres));
        for(int i = idx;i<nums.length;i++){
            subres.add(nums[i]);
            method(nums,res,subres,i+1);
            subres.remove(subres.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        subsets(a);
    }
}
