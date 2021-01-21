package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis22 {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if(n == 0){
            return res;
        }
        method("",n,n,res);
        return res;


    }
    private static void method(String str,int left, int right,List<String> res){
        if(left == 0&&right==0){
            res.add(str);
            return;
        }
        if(left>right){
            return;
        }
        if(left>0){
            method(str+"(",left-1,right,res);
        }
        if(right>0){
            method(str+")",left,right-1,res);
        }
    }

    public static void main(String[] args) {
        List<String> res = generateParenthesis(2);
    }
}
