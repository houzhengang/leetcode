package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class combinationSum39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        List<Integer> subres = new ArrayList<>();

        method(subres, target, candidates, res, 0, 0);
        return res;


    }

    private static void method(List<Integer> subres, int target, int[] candidates, List<List<Integer>> res, int sum, int idx) {
        if (sum == target) {
            res.add(new ArrayList<>(subres));

            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = idx; i < candidates.length; i++) {

            int rs = sum + candidates[i];
            subres.add(candidates[i]);
            method(subres, target, candidates, res, rs, i);
            subres.remove(subres.size() - 1);



        }


    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        int t = 7;

        List<List<Integer>> res = combinationSum(a, 7);
        System.out.println(res);
    }
}
