package leetcode.动态规划;

public class climbStairs70 {
    public static int climbStairs(int n) {
        int[] i = new int[n+1];
        if(n==0)
        {
            return 0;
        }
        else if(n==1) {
            return 1;
        }else if(n==2)
        {
            return 2;
        }else {
            i[0]=0;
            i[1]=1;
            i[2]=2;
            for(int j=3;j<n+1;j++){
                i[j]=i[j-1]+i[j-2];
            }
        }
        return i[n];
    }
    public static void main(String[] args) {
        int a = 4;
        int res= climbStairs(a);
        System.out.println(res);

    }
}
