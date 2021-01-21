package leetcode.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class permute46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        int len = nums.length;
        method(subres,nums,len,res);
        return res;
    }
    private static void method(List<Integer> subres,  int[] nums,int len, List<List<Integer>> res){
        if(subres.size()==len){
            res.add(new ArrayList<>(subres));
            return;
        }
        if(subres.size()<len){
            for(int i=0;i<nums.length;i++){
               // System.out.println(Arrays.toString(nums));
                subres.add(nums[i]);
                List<Integer> list1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
                list1.remove(i);
                int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
                method(subres,arr1,len,res);
                subres.remove(subres.size() - 1);


            }
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        List<List<Integer>> res = permute(a);
        System.out.println(res);
    }
}
