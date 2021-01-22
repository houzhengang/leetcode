package leetcode;

import java.util.ArrayList;

public class convert6 {
    public static String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
       String[] a = new String[numRows];
//        ArrayList<String> a = new ArrayList<>();
//        String a="";
        int x = numRows*2-2;
        int y = s.length()/x;
//        if(s.length()%x!=0){
//            y+=1;
//        }
        for(int i=0;i<y;i++){
            for(int j = 0;j<numRows;j++){
                if(j==0){
//                    System.out.println(s.charAt(i*x));
                    a[j] += s.charAt(i*x);
                }else if(j==numRows-1){
//                    System.out.println(s.charAt(numRows-1+i*x));
                    a[j] += s.substring(numRows-1+i*x);
                }
                else {
                    a[j] += s.charAt(j+i*x);
                    a[j] += s.charAt(x-j-1+i*x) ;
                }
            }
        }
        String res="";
        for(int i=0;i<numRows;i++){
            res +=a[i];
        }
        return res;

    }
public static void main(String[] args) {
        String s = "PAYPALISHIRI";
        String a = convert("PAYPALISHIRI",3);
    System.out.println(a);
}

}
