package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class letterCombinations17 {
    public static List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)
        {
            return res ;
        }
        Map map = Map.of("2","abc","3","def","4","ghi","5","jkl","6","mno","7","pqrs","8","tuv","9","wxyz");
        int len = digits.length();
        method(map,res,"",0,len,digits);
        return res;
    }
    private  static void method(Map map,List<String> res,String subres,int idx,int len,String digits){
        if(subres.length() == len){
            res.add(subres);
            return;
        }
        for(int i = idx;i<len;i++){

            String a = String.valueOf(digits.charAt(i));
            String value = (String) map.get(a);
            for(int j=0;j<value.length();j++){

                subres = subres+value.charAt(j);
                method(map,res,subres,i+1,len,digits);
                subres  = subres.substring(0, subres.length() - 1);
            }


        }

    }

    public static void main(String[] args) {
        letterCombinations("");
    }
}
